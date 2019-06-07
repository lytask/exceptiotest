package com.example.exceptiotest.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyException {
    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView exception1(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.toString());
        System.out.println("空指针");
        modelAndView.setViewName("error2");
        return modelAndView;
    }

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView exception(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.toString());
        System.out.println("数学异常");
        modelAndView.setViewName("temp");
        return modelAndView;
    }
}
