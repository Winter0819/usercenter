package com.winter0819.usercenter.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/getUserById" , method = RequestMethod.GET)
    public String getUserById(@RequestParam String userid) {
        return "winter0819";
    }
}
