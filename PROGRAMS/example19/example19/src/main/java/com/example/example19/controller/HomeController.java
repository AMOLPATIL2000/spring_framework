package com.example.example19.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"","/"})
    public String displayHomePage(Model model)
    {
        //model.addAttribute("username","AMOL");
        return "home.html";

    }
}
