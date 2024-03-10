package com.white.course2homework6.entitys;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Employee {
    private String firstName;
    private String lastName;
    @Override
    public String toString() {
        return " имя:" + firstName +
                " фамилия:" + lastName ;
    }
}
