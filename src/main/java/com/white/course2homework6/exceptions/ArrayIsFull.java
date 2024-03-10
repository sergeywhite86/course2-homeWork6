package com.white.course2homework6.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ArrayIsFull extends RuntimeException {
    public ArrayIsFull() {
        super("Нет места в бд");
    }
}
