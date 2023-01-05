package ru.competencies.task.constructor.core.usecases.level;

import ru.competencies.task.constructor.core.usecases.level.models.LevelResponse;

import java.util.List;

public interface GetAllLevelsUseCase {
    List<LevelResponse> handle();
}
