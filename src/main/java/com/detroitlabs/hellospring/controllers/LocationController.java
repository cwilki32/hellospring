package com.detroitlabs.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LocationController {

    @RequestMapping("/location")
    @ResponseBody

    public String getLocation() {

        return "Detroit, MI";
    }
}
