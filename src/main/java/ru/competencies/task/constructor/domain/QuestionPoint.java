package ru.competencies.task.constructor.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class QuestionPoint {
    List<String> variants;
    List<Integer> correctVariantsNumber;
    Boolean singleVariant;
}
