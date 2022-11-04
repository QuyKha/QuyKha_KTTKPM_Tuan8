package com.example.Employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee" )
public class EmployeeController {
    @GetMapping
    public String getOrder() {
        return "Hello from Employee Service";
    }
}
