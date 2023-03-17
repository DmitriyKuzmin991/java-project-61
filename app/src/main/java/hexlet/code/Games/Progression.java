package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int RANGE_START_NUMBER = 14;
    private static final int RANGE_STEP = 8;
    private static final int MIN_STEP = 3;
    private static final int RANGE_HIDDEN_POSITION = 9;
    public static final int COUNT_OF_ROUND = 3;
    public static void progression() {
        String[][] questAndAnswer = new String[COUNT_OF_ROUND][2];
        String rules = "What number is missing in the progression?";
        for (String[] round : questAndAnswer) {
            getATaskForTheRound(round);
        }
        Engine.runGame(rules, questAndAnswer);
    }

    static String printProgression(int start, int stepProgression, int hiddenPosition) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0, j = start; i <= PROGRESSION_LENGTH; i++) {
            if (i == hiddenPosition) {
                builder.append(".. ");

            } else {
                builder.append(j);
                builder.append(" ");
            }
            j += stepProgression;
        }
        return builder.toString();
    }
    static void getATaskForTheRound(String[] round) {
        int startNumber = new Random().nextInt(RANGE_START_NUMBER);
        int stepProgression = new Random().nextInt(MIN_STEP, RANGE_STEP);
        int hiddenPosition = new Random().nextInt(RANGE_HIDDEN_POSITION);
        round[0] = printProgression(startNumber, stepProgression, hiddenPosition);
        round[1] = Integer.toString(startNumber + (stepProgression * hiddenPosition));
    }
}
