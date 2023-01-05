package ru.competencies.task.constructor.core.usecases.level;

import ru.competencies.task.constructor.core.usecases.level.models.CreateLevelRequest;

public interface CreateLevelUseCase {
    void handle(CreateLevelRequest request);
}
