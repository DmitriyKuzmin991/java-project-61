package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;
import hexlet.code.GameEngine;

import java.util.Scanner;

public class GameSixPrime {
    public static void isPrimeGame() {
        String username = Cli.greetingsAndGetName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scan = new Scanner(System.in);
        int countRightAnswer = 0;
        int resultForVictory = GameEngine.countOfRound();
        while (countRightAnswer < resultForVictory) {
            int randomNumber = GameEngine.getRandomValue(6, 137);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userAnswer = scan.next();
            boolean checkPrime = isPrime(randomNumber);
            String rightAnswer = (checkPrime) ? "yes" : "no";
            if (userAnswer.equalsIgnoreCase("yes") && checkPrime) {
                System.out.println("Correct!");
                countRightAnswer++;
            } else if (userAnswer.equalsIgnoreCase("no") && !checkPrime) {
                System.out.println("Correct!");
                countRightAnswer++;
            } else {
                Cli.looseMessage(userAnswer, rightAnswer, username);
                return;
            }
        }
        Cli.winMassage(username);
    }

    static boolean isPrime(int checkingNumber) {
        int maxDiv = checkingNumber / 2;
        for (int i = 2; i <= maxDiv; i++) {
            if (checkingNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
