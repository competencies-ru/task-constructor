package ru.competencies.task.constructor.core.entity.education;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import ru.competencies.task.constructor.core.exceptions.ArgumentException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@Getter
@ToString(exclude = "ugsn")
@EqualsAndHashCode(exclude = "ugsn")
public class Level {
    private final UUID id;
    private String title;

    private final Map<UgsnCode, Ugsn> ugsn;

    public Level(UUID id, String title) {
        if (id == null) {
            throw new ArgumentException("ID образовательного уровня должно быть заполнено");
        }

        if (title == null || title.isBlank()) {
            throw new ArgumentException("Название образовательного уровня должно быть заполнено");
        }

        this.id = id;
        this.title = title;
        this.ugsn = new HashMap<>();
    }

    public boolean containsUgsnByCode(String code) {
        return ugsn.containsKey(new UgsnCode(code));
    }

    public void addUgsn(Ugsn newUgsn) {
        ugsn.put(newUgsn.getCode(), newUgsn);
    }

    public void rename(String title) {
        if (title == null || title.isEmpty()) {
            throw new ArgumentException("Название образовательного уровня должно быть заполнено");
        }

        this.title = title;
    }
}

