package com.growth.customerservicegrowth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping(value = "/")
    public String welcome(){
        return "Hello This is customer Welcome page";
    }
}
