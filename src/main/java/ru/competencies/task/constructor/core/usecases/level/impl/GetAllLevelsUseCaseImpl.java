package ru.competencies.task.constructor.core.usecases.level.impl;

import lombok.AllArgsConstructor;
import ru.competencies.task.constructor.core.usecases.level.GetAllLevelsUseCase;
import ru.competencies.task.constructor.core.usecases.level.LevelMapper;
import ru.competencies.task.constructor.core.usecases.level.LevelRepository;
import ru.competencies.task.constructor.core.usecases.level.models.LevelResponse;

import java.util.List;

@AllArgsConstructor
public class GetAllLevelsUseCaseImpl implements GetAllLevelsUseCase {
    private final LevelRepository levelRepository;
    private final LevelMapper mapper;

    @Override
    public List<LevelResponse> handle() {
        return mapper.toResponses(levelRepository.findAllLevels());
    }
}
