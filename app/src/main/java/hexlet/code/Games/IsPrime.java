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
            getATaskForTheRound(round);
        }
        Engine.runGame(rules, questAndAnswer);
    }
    static boolean isNumberPrime(int checkingNumber) {
        int maxDiv = checkingNumber / 2;
        for (int i = 2; i <= maxDiv; i++) {
            if (checkingNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void getATaskForTheRound(String[] round) {
        int randomNumber = new Random().nextInt(MAX_RANDOM_VALUE + MIN_RANDOM_VALUE);
        round[0] = Integer.toString(randomNumber);
        round[1] = (isNumberPrime(randomNumber)) ? "yes" : "no";
    }

}
