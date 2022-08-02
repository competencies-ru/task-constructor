package ru.competencies.task.constructor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserTypeEnum {

    STUDENT(1, "Студент");

    private int number;

    private String name;

}
