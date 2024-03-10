package com.white.course2homework6.service;

import com.white.course2homework6.entitys.Employee;

import java.util.List;

public interface EmployeeService {
    Employee add(String firstName,String lastName);
    Employee delete(String firstName,String lastName);
    Employee find(String firstName, String lastName);
    List<Employee> findAll();
}
