package com.winter0819.usercenter.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/getUserById" , method = RequestMethod.GET)
    public String getUserById(@RequestParam String userid) {
        logger.info("{},{},username-{}","UserController","getUserById",userid);
        return "winter0819";
    }
}
