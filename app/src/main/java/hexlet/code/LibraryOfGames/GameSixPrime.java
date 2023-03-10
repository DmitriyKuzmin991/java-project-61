package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GameSixPrime {
    private static final int UPPER_LIMIT_VALUE = 137;
    private static final int LOWER_LIMIT_VALUE = 3;
    public static boolean isPrimeGame(String userName) {
        int randomNumber = new Random().nextInt(LOWER_LIMIT_VALUE, UPPER_LIMIT_VALUE);
        System.out.println("Question: " + randomNumber);
        System.out.print("Your answer: ");
        Scanner scan = new Scanner(System.in);
        String userAnswer = scan.nextLine();
        boolean checkPrime = isPrime(randomNumber);
        String rightAnswer = (checkPrime) ? "yes" : "no";
        if (userAnswer.equalsIgnoreCase(rightAnswer)) {
            return true;
        }
        Cli.looseMessage(userAnswer, rightAnswer, userName);
        return false;
    }



    static boolean isPrime(int checkingNumber) {
        if (checkingNumber == 1) {
            return true;
        }
        int maxDiv = checkingNumber / 2;
        for (int i = 2; i <= maxDiv; i++) {
            if (checkingNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void gameSixRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
