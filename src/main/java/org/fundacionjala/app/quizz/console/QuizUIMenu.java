package org.fundacionjala.app.quizz.console;

import org.fundacionjala.app.quizz.model.Question;
import org.fundacionjala.app.quizz.model.Quiz;

import java.util.Scanner;

public class QuizUIMenu {
    IReadOption readOption= new ReadOption();

    public Quiz handleCreateQuiz() {
        System.out.println("Type the quiz title");
//        String title = askQuizTitle();
        String title = readOption.readStringOption();
        Quiz quiz = new Quiz(title);
        boolean shouldExit = false;

        do {
            showMenu();
            char option = readOption.readCharOption();
            switch (option) {
                case '1':
                    Question question = QuestionUIMenu.handleCreateQuestion();
                    quiz.addQuestion(question);
                    break;
                case '0':
                    shouldExit = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!shouldExit);

        return quiz;
    }

//    private char readOption() {
//        System.out.print("> ");
//        Scanner sc = new Scanner(System.in);
////        return System.console().readLine().trim().charAt(0);
//        return sc.next().trim().charAt(0);
//    }

    private void showMenu() {
        System.out.println("Select an option:");
        System.out.println("1. Add a new question");
        System.out.println("0. Finish");
    }

//    private String askQuizTitle() {
//        System.out.println("Type the quiz title");
////        System.out.print("> ");
////        Scanner sc = new Scanner(System.in);
//////        return System.console().readLine();
//        return readOption.readStringOption();
////        return sc.next();
//    }
}
