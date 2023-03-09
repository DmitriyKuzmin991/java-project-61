package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Scanner;

public class GameFiveProgression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int RANGE_START_NUMBER = 14;
    private static final int RANGE_STEP = 8;
    private static final int RANGE_HIDDEN_POSITION = 10;
    public static boolean progression(String userName) {
        int startNumber = (int) (Math.random() * RANGE_START_NUMBER);
        int stepProgression = (int) (Math.random() * RANGE_STEP);
        int hiddenPosition = (int) (Math.random() * RANGE_HIDDEN_POSITION);
        int hiddenValue = startNumber + (stepProgression * hiddenPosition);
        System.out.print("Question:");
        printProgression(startNumber, stepProgression, hiddenPosition);
        System.out.print("\nYour answer: ");
        Scanner scan = new Scanner(System.in);
        int userAnswer = scan.nextInt();
        if (userAnswer == hiddenValue) {
            return true;
        } else {
            Cli.looseMessage(userAnswer, hiddenValue, userName);
            return false;
        }
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
