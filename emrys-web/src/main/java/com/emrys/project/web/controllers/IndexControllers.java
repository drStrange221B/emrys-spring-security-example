package com.emrys.project.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControllers {

    @GetMapping("/")
    public String index(){

        return "front/index";
    }

    @GetMapping("/users")
    public String user()
    {

        return ("<h1> Welcome User </h1>");
    }

    @GetMapping("/admin")
    public String admin()
    {

        return ("<h1> Welcome Admin !</h1>");
    }


    @GetMapping("/login")
    public String login()
    {

        return "front/login";
    }

    @GetMapping("/about")
    public String about()
    {
        return "front/about";
    }

    @GetMapping("/contact")
    public String contact()
    {

        return "front/contact";
    }


}


