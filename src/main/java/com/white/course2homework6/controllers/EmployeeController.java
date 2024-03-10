package com.white.course2homework6.controllers;

import com.white.course2homework6.entitys.Employee;
import com.white.course2homework6.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService service;

    @GetMapping
    List<Employee> findAll() {
        return service.findAll();
    }

    @GetMapping("/add")
    public Employee add(@RequestParam String firstName, @RequestParam String lastName) {
        return service.add(firstName, lastName);
    }

    @DeleteMapping("/remove")
    public Employee delete(@RequestParam String firstName, @RequestParam String lastName) {
        return service.delete(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam(required = false) String firstName, @RequestParam String lastName) {
        return service.find(firstName, lastName);
    }
}
