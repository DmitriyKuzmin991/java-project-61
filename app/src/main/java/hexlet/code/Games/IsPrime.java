package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class IsPrime {
    private static final int MAX_RANDOM_VALUE = 137;
    private static final int MIN_RANDOM_VALUE = 4;
    public static final int COUNT_OF_ROUND = 3;

    public static void isPrime() {
        String[][] questAndAnswer = new String[COUNT_OF_ROUND][2];
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (String[] round : questAndAnswer) {
            int randomNumber = new Random().nextInt(MAX_RANDOM_VALUE + MIN_RANDOM_VALUE);
            round[0] = "Question: " + randomNumber + "\nYour answer: ";
            round[1] = verificationIsPrime((randomNumber)) ? "yes" : "no";
        }
        Engine.runGame(rules, questAndAnswer);
    }
    static boolean verificationIsPrime(int checkingNumber) {
        int maxDiv = checkingNumber / 2;
        for (int i = 2; i <= maxDiv; i++) {
            if (checkingNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
