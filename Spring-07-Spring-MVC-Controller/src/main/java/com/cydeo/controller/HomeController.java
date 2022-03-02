package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Annotate the class with the @Controller stereotype annotation
public class HomeController {

    @RequestMapping("/home")// use @RequestMapping annotation to associate the action with a HTTP request path
    public String home(){
        return "home.html";
    }
    @RequestMapping("/welcome")// Return the HTML document that contains the details we want the browser to display
    public String welcome(){
        return "welcome.html";
    }
    @RequestMapping("/home3")
    public String home3(){
        return "welcome.html";
    }
}
