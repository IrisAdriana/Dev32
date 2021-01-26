package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public class MinLengthValidator implements Validator<String, Integer> {

    private static final String ERROR_MESSAGE = "The value length must be less than ";

    @Override
    public void validate(String value, Integer conditionValue, List<String> errors) {
        if (value.length() < conditionValue) {
            errors.add(ERROR_MESSAGE + conditionValue);
        }
    }
}
