package com.example.Customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer" )
public class CustomerController {

    @GetMapping
    public String getProduct() {
        return "Hello from Customer";
    }
}
