package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Creating the REST controller 
@RestController
@RequestMapping(path = "/employees") 
public class EmployeeController { 

    @Autowired
   private EmployeeManager employeeManager; 

   
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }
        
        // Implementing a GET method 
        // to get the list of all 
        // the employees 
   @GetMapping( produces = "application/json") 
  
    public Employees getEmployees() 
    { 
  
        return employeeManager 
            .getAllEmployees(); 
    }
} 

