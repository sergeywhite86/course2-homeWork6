package com.white.course2homework6.repository;


import com.white.course2homework6.entitys.Employee;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Objects;

@Getter
@RequiredArgsConstructor
@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final InMemoryDataBase dataBase;
    private final int maxDBLength = 10;

    @Override
    public void add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        dataBase.getData().add(employee);
    }

    @Override
    public void delete(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        dataBase.getData().remove(employee);
    }

    @Override
    public Employee find(String firstName, String lastName) {
        return dataBase.getData().stream()
                .filter(Objects::nonNull)
                .filter(emp -> emp.getFirstName().equals(firstName) && emp.getLastName().equals(lastName))
                .findFirst()
                .orElseThrow();
    }

    @Override
    public List<Employee> findAll() {
        return dataBase.getData();
    }
}
