package ru.competencies.task.constructor.core.entity.education;

import lombok.Getter;
import ru.competencies.task.constructor.core.exceptions.ArgumentException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
public class Ugsn {

    private final UUID id;
    private final UgsnCode code;
    private final String title;

    private final UUID levelId;

    private final Map<SpecialtiesCode, Specialties> specialties;

    public Ugsn(UUID id, String code, String title, UUID levelId) {
        if (id == null) {
            throw new ArgumentException("ID УГСН должно быть заполнено");
        }

        if (title == null || title.isBlank()) {
            throw new ArgumentException("Название УГСН должно быть заполнено");
        }

        if (levelId == null) {
            throw new ArgumentException("ID образовательного уровня должно быть заполнено");
        }

        this.id = id;
        this.code = new UgsnCode(code);
        this.title = title;
        this.levelId = levelId;
        this.specialties = new HashMap<>();
    }
}
