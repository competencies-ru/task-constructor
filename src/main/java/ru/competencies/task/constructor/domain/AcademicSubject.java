package ru.competencies.task.constructor.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@Builder
public class AcademicSubject implements ObjectValue {
    Long id;
    String name;

    public void rename(String newName) {
        this.name = newName;
    }
}
