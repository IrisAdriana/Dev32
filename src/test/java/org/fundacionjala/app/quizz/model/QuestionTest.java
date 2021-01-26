package org.fundacionjala.app.quizz.model;

import org.fundacionjala.app.quizz.model.validator.ValidatorType;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class QuestionTest {
    //    private QuestionType questionType;
    private List<ValidatorType> validations;
    private List<String> additionalData;


    @Test
    public void getTitle() {
        Question question = new Question("iris", QuestionType.TEXT, validations);
        assertEquals("iris", question.getTitle());
    }

    @Test
    public void getType() {
        Question question = new Question("iris", QuestionType.DATE, validations);
        assertEquals(QuestionType.DATE, question.getType());
    }


}