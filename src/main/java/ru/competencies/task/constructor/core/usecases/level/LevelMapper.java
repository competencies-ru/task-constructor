package ru.competencies.task.constructor.core.usecases.level;

import org.mapstruct.Mapper;
import ru.competencies.task.constructor.core.entity.education.Level;
import ru.competencies.task.constructor.core.usecases.level.models.LevelResponse;

import java.util.List;

@Mapper
public interface LevelMapper {

    LevelResponse toResponse(Level level);
    List<LevelResponse> toResponses(List<Level> levels);

}
