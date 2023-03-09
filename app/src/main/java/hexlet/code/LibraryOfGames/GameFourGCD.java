package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Scanner;

public class GameFourGCD {
    private static final int MAX_VALUE = 100;
    public static boolean gameFourGCD(String userName) {
        var scan = new Scanner(System.in);
        int firstValue = (int) (Math.random() * MAX_VALUE);
        int secondValue = (int) (Math.random() * MAX_VALUE);
        int correctAnswer = findGCD(firstValue, secondValue);
        System.out.print("Question: " + firstValue + " " + secondValue);
        System.out.print("\nYour answer: ");
        int userAnswer = scan.nextInt();
        if (userAnswer != correctAnswer) {
            Cli.looseMessage(userAnswer, correctAnswer, userName);
            return false;
        } else {
            return true;
        }
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
