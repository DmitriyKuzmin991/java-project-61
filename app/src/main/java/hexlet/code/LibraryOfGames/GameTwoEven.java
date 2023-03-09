package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Scanner;

public class GameTwoEven {
    private static final int RANGE_MAX_VALUE = 100;
    public static boolean gameTwoIsNumberEven(String userName) {
        Scanner scanGameTwo = new Scanner(System.in);
        int number = (int) (Math.random() * RANGE_MAX_VALUE);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String userAnswer = scanGameTwo.next();
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        if (number % 2 == 0 && userAnswer.equalsIgnoreCase(correctAnswer)) {
            return true;
        } else if (number % 2 != 0 && userAnswer.equalsIgnoreCase(correctAnswer)) {
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
