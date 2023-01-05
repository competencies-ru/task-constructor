package ru.competencies.task.constructor.core.usecases.level.models;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class CreateLevelRequest {
    private String title;
}
