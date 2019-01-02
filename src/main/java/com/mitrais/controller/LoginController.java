package com.mitrais.controller;

import com.mitrais.model.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("loginform", "command", new User());
    }

    @RequestMapping(value = "/loginUser", method = RequestMethod.POST)
    public String loginUser(@ModelAttribute("command") @Validated User user,
                            ModelMap model) {
        model.addAttribute("userName", user.getUserName());
        model.addAttribute("userPass", user.getUserPass());
        model.addAttribute("userComment", user.getUserComment());
        model.addAttribute("userGender", user.getUserGender());
        model.addAttribute("userNationality", user.getUserNationality());
        model.addAttribute("receivePaper", user.isReceivePaper());
        model.addAttribute("knownFramework", user.getKnownFramework());
        model.addAttribute("joinDate", user.getJoinDate());
        return "loginuser";
    }

    @ModelAttribute("webJavaFramework")
    public List<String> getWebJavaFramework() {
        List<String> webFrameworkList = new ArrayList<>();
        webFrameworkList.add("Spring MVC");
        webFrameworkList.add("Struts");
        webFrameworkList.add("Stripes");
        webFrameworkList.add("Apache Wicket");
        return webFrameworkList;
    }

    @ModelAttribute("nationality")
    public Map<String, String> getNationality() {
        Map<String, String> mapNationality = new HashMap<>();
        mapNationality.put("US", "United States");
        mapNationality.put("UK", "United Kingdom");
        mapNationality.put("DE", "Germany");
        mapNationality.put("ID", "Indonesia");
        mapNationality.put("SG", "Singapore");
        mapNationality.put("JP", "Japan");
        mapNationality.put("CA", "Canada");
        return mapNationality;
    }
}
