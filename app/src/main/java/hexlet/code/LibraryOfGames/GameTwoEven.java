package hexlet.code.LibraryOfGames;

import java.util.Random;

public class GameTwoEven {
    private static final int UPPER_LIMIT_NUMBER = 99;
    public static String  gameTwoIsNumberEven() {
        int number = new Random().nextInt(UPPER_LIMIT_NUMBER);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        return (number % 2 == 0) ? "yes" : "no";
    }
    public static void  gameTwoRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
