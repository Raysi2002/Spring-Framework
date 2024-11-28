package com.raysi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/about")
    public String openAboutPage(){
        return "about";
    }

    @GetMapping("/profile")
    public String openProfile(){
        return "profile";
    }

}
