package ru.competencies.task.constructor.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class ArgumentException extends RuntimeException {

    public ArgumentException(String message) {
        super(message);
    }
}
