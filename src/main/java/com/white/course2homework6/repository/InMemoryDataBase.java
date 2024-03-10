package com.white.course2homework6.repository;

import com.white.course2homework6.entitys.Employee;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Getter
public class InMemoryDataBase {
    private final List<Employee> data;

    public InMemoryDataBase() {
        data = new ArrayList<>();
        initDB();
    }

    private void initDB() {
        data.add(new Employee("Сергей", "Белый"));
        data.add(new Employee("Сергей", "Бобылев"));
        data.add(new Employee("Марина", "Управова"));
        data.add(new Employee("Роман", "Иванов"));
        data.add(new Employee("Лариса", "Поисковна"));
        data.add(new Employee("Иван", "Гусь"));
        data.add(new Employee("Дмитрий", "Гришенков"));
        data.add(new Employee("Лука", "Святой"));
    }
}
