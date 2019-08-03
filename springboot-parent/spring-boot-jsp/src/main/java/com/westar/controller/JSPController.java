package com.westar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPController {

    @RequestMapping("/index")
    public String show(Model model){
        model.addAttribute("name","李四");
        return "index";
    }
}
