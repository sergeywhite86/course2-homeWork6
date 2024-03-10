package com.white.course2homework6.service;


import com.white.course2homework6.entitys.Employee;
import com.white.course2homework6.exceptions.ArrayIsFull;
import com.white.course2homework6.exceptions.EmployeeAlreadyAdded;
import com.white.course2homework6.exceptions.EmployeeNotFound;
import com.white.course2homework6.repository.EmployeeRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepositoryImpl repository;

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (repository.findAll().size() >= repository.getMaxDBLength()) throw new ArrayIsFull();
        if (repository.findAll().contains(new Employee(firstName, lastName))) throw new EmployeeAlreadyAdded();
        repository.add(firstName, lastName);
        return employee;
    }

    @Override
    public Employee delete(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (repository.findAll().contains(employee)) throw new EmployeeAlreadyAdded();
        repository.delete(firstName, lastName);
        return employee;
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!repository.findAll().contains(employee)) throw new EmployeeNotFound();
        return repository.find(firstName, lastName);
    }

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }
}
