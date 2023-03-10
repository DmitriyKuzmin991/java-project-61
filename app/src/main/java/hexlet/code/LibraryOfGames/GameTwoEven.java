package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GameTwoEven {
    private static final int UPPER_LIMIT_NUMBER = 99;
    public static boolean gameTwoIsNumberEven(String userName) {
        int number = new Random().nextInt(99);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner scanGameTwo = new Scanner(System.in);
        String userAnswer = scanGameTwo.next();
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            return true;
        } else {
            Cli.looseMessage(userAnswer, correctAnswer, userName);
            return false;
        }
    }
    public static void  gameTwoRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
