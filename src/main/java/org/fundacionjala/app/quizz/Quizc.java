package org.fundacionjala.app.quizz;

public class Quizc {

    public void run() {
        Menu menu = new Menu();
        boolean shouldExit;
        do {
            shouldExit = menu.process();
        } while (!shouldExit);
    }
}
