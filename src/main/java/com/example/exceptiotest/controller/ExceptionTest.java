package com.example.exceptiotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionTest {

    @RequestMapping("/test")
    public String index(Model model){
        String str = null;
        str.length();
        return "index";
    }

    @RequestMapping("/test2")
    public String index2(Model model){
        int b = 10/0;
        return "index";
    }

    public String index3(Model model){
        System.out.println("测试");
        return "index";
    }
 /*   @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView exception1(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.toString());
        modelAndView.setViewName("error2");
        return modelAndView;
    }

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView exception(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.toString());
        modelAndView.setViewName("temp");
        return modelAndView;
    }*/
}
