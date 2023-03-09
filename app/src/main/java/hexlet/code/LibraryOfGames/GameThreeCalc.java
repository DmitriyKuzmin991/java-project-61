package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GameThreeCalc {
    private static final int MAX_RANDOM_VALUE = 100;
    private static final int VARIANT_MATH_SIGN = 3;
    public static boolean gameThreeCalc(String userName) {
        int firstValue = (int) (Math.random() * MAX_RANDOM_VALUE);
        int secondValue = (int) (Math.random() * MAX_RANDOM_VALUE);
        int mathSignRandom = new Random().nextInt(VARIANT_MATH_SIGN);
        int correctAnswer = 0;
        System.out.print("Question: ");
        switch (mathSignRandom) {
            case (0) -> {
                System.out.println(firstValue + " + " + secondValue);
                correctAnswer = firstValue + secondValue;
            }
            case (1) -> {
                System.out.println(firstValue + " - " + secondValue);
                correctAnswer = firstValue - secondValue;
            }
            case (2) -> {
                System.out.println(firstValue + " * " + secondValue);
                correctAnswer = firstValue * secondValue;
            }
            default -> {
                return false;
            }
        }
        System.out.print("Your answer: ");
        Scanner scan = new Scanner(System.in);
        int userAnswer = scan.nextInt();
        if (correctAnswer == userAnswer) {
            return true;
        } else {
            Cli.looseMessage(userAnswer, correctAnswer, userName);
            return false;
        }
    }

    public static void  gameThreeRules() {
        System.out.println("What is the result of the expression?");
    }
}
