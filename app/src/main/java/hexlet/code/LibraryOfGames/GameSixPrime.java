package hexlet.code.LibraryOfGames;

import java.util.Random;

public class GameSixPrime {
    private static final int RANGE_RANDOM_VALUE = 137;
    public static String isPrimeGame() {
        int randomNumber = new Random().nextInt(RANGE_RANDOM_VALUE);
        System.out.println("Question: " + randomNumber);
        System.out.print("Your answer: ");
        return isPrime(randomNumber);
    }
    static String isPrime(int checkingNumber) {
        int maxDiv = checkingNumber / 2;
        for (int i = 2; i <= maxDiv; i++) {
            if (checkingNumber % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
    public static void gameSixRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
