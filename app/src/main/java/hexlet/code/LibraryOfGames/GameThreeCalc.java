package hexlet.code.LibraryOfGames;
import hexlet.code.GameEngine;

import java.util.Random;

public class GameThreeCalc {
    private static final int LIMIT_FIRST_VALUE = 123;
    private static final int LIMIT_SECOND_VALUE = 25;
    private static final int VARIANT_MATH_SIGN = 3;

    public static void gameThreeCalc() {
        int gameRound = 0;
        String[] question = new String[GameEngine.COUNT_OF_ROUND];
        String[] rightAnswer = new String[GameEngine.COUNT_OF_ROUND];
        String rules = "What is the result of the expression?";
        while (gameRound < GameEngine.COUNT_OF_ROUND) {
            int firstValue = new Random().nextInt(LIMIT_FIRST_VALUE);
            int secondValue = new Random().nextInt(LIMIT_SECOND_VALUE);
            int mathSign = new Random().nextInt(VARIANT_MATH_SIGN);
            int correctAnswer;
            String sign;
            switch (mathSign) {
                case (0) -> {
                    sign = " + ";
                    correctAnswer = firstValue + secondValue;
                }
                case (1) -> {
                    sign = " - ";
                    correctAnswer = firstValue - secondValue;
                }
                default -> {
                    sign = " * ";
                    correctAnswer = firstValue * secondValue;
                }
            }
            question[gameRound] = "Question: " + firstValue + sign + secondValue + "\nYour answer: ";
            rightAnswer[gameRound] = Integer.toString(correctAnswer);
            gameRound++;
        }
        GameEngine.engineApp(rules, question, rightAnswer);
    }
}
