package com.white.course2homework6.repository;

import com.white.course2homework6.entitys.Employee;

import java.util.List;

public interface EmployeeRepository {
    void add(String firstName, String lastName);

    void delete(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    List<Employee> findAll();
}
