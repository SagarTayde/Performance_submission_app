package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Feedback;
import com.example.demo.Entity.Performance;
import com.example.demo.Services.EmployeeService;

@RestController
public class EmployeeController {

    // Dependency Injection
    @Autowired
    private EmployeeService employeeService;

    // Employee Test API
    @RequestMapping("api/test")
    public String employeeAPI_test() {
        return "Hi, I am an Employee API!";
    }

    // GET (Employee Login -> By ID -> Primary Key)
    @RequestMapping("/api/login/{id}")
    public List<Performance> employeeDashboard(@PathVariable Integer id) {
        return employeeService.displayEmployeesPerformances(id);
    }

    // Submit Feedback -> (id -> POST_REQUEST_CLIENT_ID, feedback -> JSON{EMPLOYEE_ID, FEEDBACKTOBESUBMITTED})
    @RequestMapping(method = RequestMethod.POST, value = "/api/submit/{id}")
    public void submit(@RequestBody Feedback feedback, @PathVariable Integer id) {
        employeeService.submitFeedback(id, feedback);
    }
}
