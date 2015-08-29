package com.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
 
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
 
        String message = "Hello World, Spring 3.0!, Muni Sekhar";
        return new ModelAndView("hello", "value", message);
    }
    @RequestMapping("/welcome")
    public ModelAndView welcometoSpringWorld() {
 
        String message = "Hello Muni Sekhar when is what ???";
        return new ModelAndView("welcome", "message", message);
    }
}