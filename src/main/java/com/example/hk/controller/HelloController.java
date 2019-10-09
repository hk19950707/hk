package com.example.hk.controller;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say(Model model) {
//        p.setName("hk");
        Person p = new Person("111",22,34);
        model.addAttribute("user",p);
        return "index";
    }
    @Test
    public void aa(){
        Person p = new Person("111",22,34);
        System.out.println(p);
    }

}
