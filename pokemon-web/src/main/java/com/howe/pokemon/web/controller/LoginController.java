package com.howe.pokemon.web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvmo on 15/9/7.
 */
@RestController
@EnableAutoConfiguration
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "login success!";
    }
}
