package ru.competencies.task.constructor.core.usecases.level.models;

import lombok.Data;

import java.util.UUID;

@Data
public class LevelResponse {
    private UUID id;
    private String title;
}
