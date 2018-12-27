package com.mitrais.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String index() {
        return "pagemain";
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {

        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {

        return "pagefinal";
    }
}
