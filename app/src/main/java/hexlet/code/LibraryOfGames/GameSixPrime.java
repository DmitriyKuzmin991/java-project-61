package hexlet.code.LibraryOfGames;

import hexlet.code.GameEngine;

import java.util.Random;

public class GameSixPrime {
    private static final int MAX_RANDOM_VALUE = 137;
    private static final int MIN_RANDOM_VALUE = 4;

    public static void isPrimeGame() {
        int gameRound = 0;
        String[] question = new String[GameEngine.COUNT_OF_ROUND];
        String[] rightAnswer = new String[GameEngine.COUNT_OF_ROUND];
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        while (gameRound < GameEngine.COUNT_OF_ROUND) {
            int randomNumber = new Random().nextInt(MAX_RANDOM_VALUE + MIN_RANDOM_VALUE);
            question[gameRound] = "Question: " + randomNumber + "\nYour answer: ";
            rightAnswer[gameRound] = isPrime(randomNumber);
            gameRound++;
        }
        GameEngine.engineApp(rules, question, rightAnswer);
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
}
