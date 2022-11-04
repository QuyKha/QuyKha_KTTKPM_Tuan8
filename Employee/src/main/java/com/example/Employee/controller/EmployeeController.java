package com.example.Employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Controller;

@RestController
@RequestMapping(value = "/employee" )
public class EmployeeController {
	  @GetMapping
	    @CircuitBreaker(name = "inventory",fallbackMethod = "fallbackMethod")
	    public String getOrder() {
	        return "Hello from Order Service";
	    }

	    public String fallbackMethod(RuntimeException runtimeException) {
	        return "Something went wrong, please request order a next time";
    }
}
