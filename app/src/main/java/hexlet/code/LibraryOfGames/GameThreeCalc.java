package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GameThreeCalc {
    private static final int LIMIT_FIRST_VALUE = 123;
    private static final int LIMIT_SECOND_VALUE = 25;
    private static final int VARIANT_MATH_SIGN = 3;

    public static boolean gameThreeCalc(String userName) {
        int firstValue = new Random().nextInt(LIMIT_FIRST_VALUE);
        int secondValue = new Random().nextInt(LIMIT_SECOND_VALUE);
        int mathSign = new Random().nextInt(VARIANT_MATH_SIGN);
        int correctAnswer;
        String sign = "";
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
        System.out.print("Question: ");
        System.out.println(firstValue + sign + secondValue);
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
