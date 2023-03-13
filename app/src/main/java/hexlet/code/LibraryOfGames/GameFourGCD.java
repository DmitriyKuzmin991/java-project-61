package hexlet.code.LibraryOfGames;

import hexlet.code.GameEngine;

public class GameFourGCD {
    private static final int LIMIT_MAX_VALUE = 100;

    public static void gameFourGCD() {
        int gameRound = 0;
        String[] question = new String[GameEngine.COUNT_OF_ROUND];
        String[] rightAnswer = new String[GameEngine.COUNT_OF_ROUND];
        String rules = "Find the greatest common divisor of given numbers.";
        while (gameRound < GameEngine.COUNT_OF_ROUND) {
            int firstValue = (int) (Math.random() * LIMIT_MAX_VALUE);
            int secondValue = (int) (Math.random() * LIMIT_MAX_VALUE);
            question[gameRound] = "Question: " + firstValue + " " + secondValue + "\nYour answer: ";
            rightAnswer[gameRound] = findGCD(firstValue, secondValue);
            gameRound++;
        }
        GameEngine.engineApp(rules, question, rightAnswer);
    }

    static String findGCD(int firstValue, int secondValue) {
        int maxValue = Math.max(firstValue, secondValue);
        int minValue = Math.min(firstValue, secondValue);
        while (minValue != 0) {
            int temp = maxValue % minValue;
            maxValue = minValue;
            minValue = temp;
        }
        return Integer.toString(maxValue);
    }
}
