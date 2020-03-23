package com.surya.movie.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MovieController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("reached here");
        return "hello all";
    }
}
