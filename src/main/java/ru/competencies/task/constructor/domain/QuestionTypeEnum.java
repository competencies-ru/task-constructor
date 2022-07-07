package ru.competencies.task.constructor.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.Arrays;
import java.util.function.Predicate;


@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public enum QuestionTypeEnum {
    AUTO_CODE_CHECK(1, "AUTO_CODE_CHECK"), TESTING(2, "TESTING"), MANUAL_ANSWER(3, "MANUAL_ANSWER"), ESSAY(3, "ESSAY");

    final int code;
    final String name;


    public static QuestionTypeEnum getByCode(int code) {
        return filter(s -> s.code == code);
    }

    public static QuestionTypeEnum getByName(final String name) {
        return filter(s -> s.name.equals(name));
    }

    private static QuestionTypeEnum filter(Predicate<QuestionTypeEnum> questionTypeEnumPredicate) {
        return Arrays.stream(values()).filter(questionTypeEnumPredicate).findFirst().orElseThrow(() -> new IllegalArgumentException("Неверный тип вопроса"));
    }

}
