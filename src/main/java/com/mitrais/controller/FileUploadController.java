package com.mitrais.controller;

import com.mitrais.model.FileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import java.io.*;
import java.nio.file.StandardCopyOption;

@Controller
public class FileUploadController {
    @Autowired
    ServletContext servletContext;

    @RequestMapping(value = "/fileUpload", method = RequestMethod.GET)
    public ModelAndView fileUploadPage() {
        FileModel file = new FileModel();
        ModelAndView mv = new ModelAndView("fileUpload", "command", file);
        return mv;
    }

    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    public String fileUpload(@Validated FileModel file, BindingResult result, ModelMap model) throws IOException {
        MultipartFile multipartFile = null;
        if (result.hasErrors()) {
            System.out.println("validation errors");
            return "fileUploadError";
        } else {
            System.out.println("Fetching file");
            multipartFile = file.getFile();
            if(multipartFile == null || multipartFile.isEmpty()) {
                System.out.println("validation errors");
                return "fileUploadError";
            }
        }

        String uploadPath = servletContext.getRealPath("") + File.separator + "uploadDirectory" + File.separator;
        // check whether the directory exists or not
        File uploadDirectory = new File(uploadPath);
        if(!uploadDirectory.exists()) {
            // if the directory does not exist then create a new one
            uploadDirectory.mkdir();
            System.out.println("Directory " + uploadPath + " has been created");
        }

        //Now copy file to the intended directory
        InputStream input = new BufferedInputStream(file.getFile().getInputStream());
        File targetFile = new File(uploadPath + file.getFile().getOriginalFilename());
        java.nio.file.Files.copy(
                input,
                targetFile.toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        String fileName = multipartFile.getOriginalFilename();
        model.addAttribute("fileName", fileName);

        return "fileUploadSuccess";
    }
}
