package ru.competencies.task.constructor.core.usecases.level.impl;

import lombok.AllArgsConstructor;
import ru.competencies.task.constructor.core.entity.education.Level;
import ru.competencies.task.constructor.core.usecases.level.CreateLevelUseCase;
import ru.competencies.task.constructor.core.usecases.level.LevelRepository;
import ru.competencies.task.constructor.core.usecases.level.models.CreateLevelRequest;

import java.util.UUID;

@AllArgsConstructor
public class CreateLevelUseCaseImpl implements CreateLevelUseCase {
    private final LevelRepository repository;
    @Override
    public void handle(CreateLevelRequest request) {
        Level level = new Level(UUID.randomUUID(), request.getTitle());
        repository.saveLevel(level);
    }
}
