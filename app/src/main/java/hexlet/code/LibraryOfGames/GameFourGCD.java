package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Scanner;

public class GameFourGCD {
    private static final int LIMIT_MAX_VALUE = 100;
    public static boolean gameFourGCD(String userName) {
        var scan = new Scanner(System.in);
        int firstValue = (int) (Math.random() * LIMIT_MAX_VALUE);
        int secondValue = (int) (Math.random() * LIMIT_MAX_VALUE);
        String correctAnswer = Integer.toString(findGCD(firstValue, secondValue));
        System.out.println("Question: " + firstValue + " " + secondValue);
        System.out.print("Your answer: ");
        String userAnswer = scan.nextLine();
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            return true;
        }
        Cli.looseMessage(userAnswer, correctAnswer, userName);
        return false;

    }
    static int findGCD(int firstValue, int secondValue) {
        int maxValue = Math.max(firstValue, secondValue);
        int minValue = Math.min(firstValue, secondValue);
        while (minValue != 0) {
            int temp = maxValue % minValue;
            maxValue = minValue;
            minValue = temp;
        }
        return maxValue;
    }
    public static void  gameFourRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }
}
