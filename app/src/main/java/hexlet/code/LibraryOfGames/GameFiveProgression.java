package hexlet.code.LibraryOfGames;

import hexlet.code.GameEngine;

import java.util.Random;

public class GameFiveProgression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int RANGE_START_NUMBER = 14;
    private static final int RANGE_STEP = 8;
    private static final int RANGE_HIDDEN_POSITION = 9;
    public static void progression() {
        int gameRound = 0;
        String[] question = new String[GameEngine.COUNT_OF_ROUND];
        String[] rightAnswer = new String[GameEngine.COUNT_OF_ROUND];
        String rules = "What number is missing in the progression?";
        while (gameRound < GameEngine.COUNT_OF_ROUND) {
            int startNumber = new Random().nextInt(RANGE_START_NUMBER);
            int stepProgression = new Random().nextInt(RANGE_STEP);
            int hiddenPosition = new Random().nextInt(RANGE_HIDDEN_POSITION);
            question[gameRound] = "Question: " + printProgression(startNumber, stepProgression, hiddenPosition)
                                + "\nYour answer: ";
            rightAnswer[gameRound] = Integer.toString(startNumber + (stepProgression * hiddenPosition));
            gameRound++;
        }
        GameEngine.engineApp(rules, question, rightAnswer);
    }

    static String printProgression(int start, int stepProgression, int hiddenPosition) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0, j = start; i <= PROGRESSION_LENGTH; i++) {
            if (i == hiddenPosition) {
                builder.append(" ..");

            } else {
                builder.append(" ");
                builder.append(j);
            }
            j += stepProgression;
        }
        return builder.toString();
    }
}
