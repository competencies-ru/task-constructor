package ru.competencies.task.constructor.core.entity.education;

import lombok.Getter;
import ru.competencies.task.constructor.core.exceptions.ArgumentException;

import java.util.UUID;

@Getter
public class Program {
    private final UUID id;
    private final ProgramCode code;
    private final String title;

    private final UUID specialtyId;


    public Program(UUID id, String code, String title, UUID specialtyId) {
        if (id == null) {
            throw new ArgumentException("ID образовательной программы должно быть заполнено");
        }

        if (title == null || title.isBlank()) {
            throw new ArgumentException("Название образовательной программы должно быть заполнено");
        }

        if (specialtyId == null) {
            throw new ArgumentException("ID направления должно быть заполнено");
        }

        this.id = id;
        this.code = new ProgramCode(code);
        this.title = title;
        this.specialtyId = specialtyId;
    }
}
