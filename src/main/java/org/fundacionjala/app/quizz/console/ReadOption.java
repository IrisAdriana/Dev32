package org.fundacionjala.app.quizz.console;

import java.util.Scanner;

public class ReadOption implements IReadOption {

    public char readCharOption() {
        System.out.print("> ");
        Scanner sc = new Scanner(System.in);
        return sc.next().trim().charAt(0);
    }

    public String readStringOption() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
