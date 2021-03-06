package ru.competencies.task.constructor.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Task {
     UUID taskId;
     String title;
     String description;
     List<Question> questions;
     Academic teacher;
     List<Academic> students;
     List<AcademicSubject> tagsSubject;
}
