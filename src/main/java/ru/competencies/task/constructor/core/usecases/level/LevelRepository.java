package ru.competencies.task.constructor.core.usecases.level;

import ru.competencies.task.constructor.core.entity.education.Level;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LevelRepository {
    Level saveLevel(Level level);

    Optional<Level> findById(UUID id);

    List<Level> findAllLevels();
}
