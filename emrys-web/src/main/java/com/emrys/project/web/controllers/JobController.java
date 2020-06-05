package com.emrys.project.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jobs")
public class JobController {


    @GetMapping("/")
    public String getJobs()
    {
        return "jobs/index";
    }
}
