package ru.competencies.task.constructor.core.entity.education;

import ru.competencies.task.constructor.core.exceptions.ArgumentException;

public record UgsnCode(String code) {
    public UgsnCode {
        if (code == null || code.isBlank()) {
            throw new ArgumentException("Код должен быть заполнен");
        }

        if (!code.matches("^(0[1-9]{1}|[1-9]{1}[0-9]{1})\\.00\\.00$")) {
            throw new ArgumentException("Код УГСН имеет неверный форматы");
        }
    }
}
