package com.mitrais.controller;

import com.mitrais.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("loginform", "command", new User());
    }

    @RequestMapping(value = "/loginUser", method = RequestMethod.POST)
    public String loginUser(@ModelAttribute("user")User user,
                            ModelMap model) {
        model.addAttribute("userName", user.getUserName());
        model.addAttribute("userPass", user.getUserPass());
        model.addAttribute("userComment", user.getUserComment());
        model.addAttribute("userGender", user.getUserGender());
        model.addAttribute("userNationality", user.getUserNationality());
        model.addAttribute("receivePaper", user.isReceivePaper());
        model.addAttribute("knownFramework", user.getKnownFramework());
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
