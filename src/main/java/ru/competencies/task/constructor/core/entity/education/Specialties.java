package ru.competencies.task.constructor.core.entity.education;

import lombok.Getter;
import ru.competencies.task.constructor.core.exceptions.ArgumentException;

import java.util.UUID;

@Getter
public class Specialties {

    private final UUID id;
    private final SpecialtiesCode code;
    private final String title;

    private final UUID ugsnId;


    public Specialties(UUID id, String code, String title, UUID ugsnId) {
        if (id == null) {
            throw new ArgumentException("ID направления должно быть заполнено");
        }

        if (title == null || title.isBlank()) {
            throw new ArgumentException("Название направления должно быть заполнено");
        }

        if (ugsnId == null) {
            throw new ArgumentException("ID УГСН должен быть заполнен");
        }

        this.id = id;
        this.code = new SpecialtiesCode(code);
        this.title = title;
        this.ugsnId = ugsnId;
    }

}
