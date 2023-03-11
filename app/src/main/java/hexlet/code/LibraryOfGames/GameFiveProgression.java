package hexlet.code.LibraryOfGames;

import java.util.Random;

public class GameFiveProgression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int RANGE_START_NUMBER = 14;
    private static final int RANGE_STEP = 8;
    private static final int RANGE_HIDDEN_POSITION = 9;
    public static String progression() {
        int startNumber = new Random().nextInt(RANGE_START_NUMBER);
        int stepProgression = new Random().nextInt(RANGE_STEP);
        int hiddenPosition = new Random().nextInt(RANGE_HIDDEN_POSITION);
        System.out.print("Question:");
        printProgression(startNumber, stepProgression, hiddenPosition);
        System.out.print("\nYour answer: ");
        return Integer.toString(startNumber + (stepProgression * hiddenPosition));
    }

    static void printProgression(int start, int stepProgression, int hiddenPosition) {
        for (int i = 0, j = start; i <= PROGRESSION_LENGTH; i++) {
            if (i == hiddenPosition) {
                System.out.print(" ..");
            } else {
                System.out.printf(" %s", j);
            }
            j += stepProgression;
        }
    }
    public static void gameFiveRules() {
        System.out.println("What number is missing in the progression?");
    }
}
