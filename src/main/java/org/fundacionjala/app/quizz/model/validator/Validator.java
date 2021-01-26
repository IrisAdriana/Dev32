package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public interface Validator<VALUE_TYPE, CONDITIONAL_TYPE> {
    void validate(VALUE_TYPE value, CONDITIONAL_TYPE conditionValue, List<String> errors);
}
