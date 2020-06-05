package com.emrys.project.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/events")
public class EventContoller {


    @GetMapping("/")
    public String getEvents()
    {
        return "events/index";
    }

}
