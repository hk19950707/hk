package com.example.hk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.example.hk.exception.ServiceException.PLAN_ALREADY_RELEASE;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String say() {
        return "index";
    }

}
