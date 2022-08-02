package ru.competencies.task.constructor.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Question {
    UUID questionId;
    String description;
    BigDecimal rank;
    QuestionTypeEnum questionType;
    List<QuestionData> data;

}
