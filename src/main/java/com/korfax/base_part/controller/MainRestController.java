package com.korfax.base_part.controller;

import com.korfax.base_part.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainRestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{login}")
    public String test(@PathVariable("login") String login) {
        log.debug("Hello World, "+ String.valueOf(login) +"!");
        return "Greetings, "+ String.valueOf(userService.getUserByLogin(login)) +"!";
    }

}
