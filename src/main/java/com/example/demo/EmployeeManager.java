package com.example.demo;

public class EmployeeManager {
    private static Employees list = new Employees();

    // This static block is executed
    // before executing the main
    // block
    static {

        // Creating a few employees
        // and adding them to the list
        list.getEmployeeList().add(
                new Employee(
                        1,
                        "Prem",
                        "Tiwari",
                        "chapradreams@gmail.com",
                        "Software Developer"));

        list.getEmployeeList().add(
                new Employee(
                        2,
                        "Vikash",
                        "Kumar",
                        "abc@gmail.com",
                        "Frontend Developer"));

        list.getEmployeeList().add(
                new Employee(
                        3,
                        "Ritesh",
                        "Ojha",
                        "asdjf@gmail.com",
                        "Backend Developer"));

    }

    // Method to return the list
    public Employees getAllEmployees() {
        return list;
    }

    // Method to add an employee
    // to the employees list
    public void addEmployee(Employee employee) {
        list.getEmployeeList()
                .add(employee);

    }
}
