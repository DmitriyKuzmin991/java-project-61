package hexlet.code.LibraryOfGames;

import hexlet.code.GameEngine;

import java.util.Random;

public class GameTwoEven {
    private static final int UPPER_LIMIT_NUMBER = 99;
    public static void  gameTwoIsNumberEven() {
        int gameRound = 0;
        String[] question = new String[GameEngine.COUNT_OF_ROUND];
        String[] rightAnswer = new String[GameEngine.COUNT_OF_ROUND];
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        while (gameRound < GameEngine.COUNT_OF_ROUND) {
            int number = new Random().nextInt(UPPER_LIMIT_NUMBER);
            question[gameRound] = "Question: " + number + "\nYour answer: ";
            rightAnswer[gameRound] = (number % 2 == 0) ? "yes" : "no";
            gameRound++;
        }
        GameEngine.engineApp(rules, question, rightAnswer);




    }
}
