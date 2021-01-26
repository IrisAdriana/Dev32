package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public class MinValidator implements Validator<Integer, Integer> {

    private static final String ERROR_MESSAGE = "The value must be greater than ";

    @Override
    public void validate(Integer value, Integer conditionValue, List<String> errors) {
        if (value < conditionValue) {
            errors.add(ERROR_MESSAGE + conditionValue);
        }
    }
}
