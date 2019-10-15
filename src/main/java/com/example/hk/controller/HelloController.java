package com.example.hk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.example.hk.exception.ServiceException.PLAN_ALREADY_RELEASE;


@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        if (true){
            throw PLAN_ALREADY_RELEASE;
        }
        return "index";
    }

}
