package com.korfax.base_part.controller;

import com.korfax.base_part.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainRestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test/{testString}")
    public @ResponseBody String test(@PathVariable("testString") String testString) {
        log.debug("Hello World, "+ String.valueOf(testString) +"!");
        return "Greetings, "+ String.valueOf(userService.getUserByLogin(testString)) +"!";
    }

    @RequestMapping("/domain/admin")
    public @ResponseBody String adminRest() {
        log.debug("Admin zone is entered!");
        return "Greetings admin!";
//        log.debug("Admin zone entered by "+ String.valueOf(user) +"!");
//        return "Greetings admin "+ String.valueOf(user.getName()) +"!";
    }

    @RequestMapping("/domain/user")
    public @ResponseBody String userRest() {
        log.debug("User zone is entered!");
        return "Greetings user!";
//        log.debug("User zone entered by "+ String.valueOf(user) +"!");
//        return "Greetings user "+ String.valueOf(user.getName()) +"!";
    }

}
