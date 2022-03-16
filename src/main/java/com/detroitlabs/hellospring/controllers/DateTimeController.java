package com.detroitlabs.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class DateTimeController {

    @RequestMapping("/datetime")
    @ResponseBody

    public String tellTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        String dateTimeString = formatter.format(now);
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;
//        String dateTimeFormatter = timeFormatter.format(now);
        return dateTimeString ; //+ "<br>" + dateTimeFormatter;
//        return "Test";
    }
}
