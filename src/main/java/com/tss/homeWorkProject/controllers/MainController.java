package com.tss.homeWorkProject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

    @RequestMapping("/next")
    public ModelAndView next() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("next.html");
        return modelAndView;
    }

}
