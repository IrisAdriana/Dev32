package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

import org.fundacionjala.app.quizz.model.configuration.DateConfiguration;

public class DateValidator implements Validator<String, String> {

    private static final String ERROR_MESSAGE = "The date format is invalid, it should have the format mm/dd/yyyy";

    @Override
    public void validate(String value, String conditionValue, List<String> errors) {
        try {
            DateConfiguration.FORMATTER.format(value);
        } catch (NullPointerException | IllegalArgumentException exception) {
            errors.add(ERROR_MESSAGE);
        }
    }
}
