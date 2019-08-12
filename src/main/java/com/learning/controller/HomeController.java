package com.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView index() {
        System.out.println("进入 HomeController index() 方法.");
        ModelAndView modelAndView = new ModelAndView("index",
                "message", "laowang");
        return modelAndView;
    }

}
