package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GameSixPrime {
    public static void isPrimeGame() {
        String username = Cli.greetingsAndGetName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scan = new Scanner(System.in);
        int countRightAnswer = 0;
        while (countRightAnswer < 3) {
            int randomNumber = new Random().nextInt(6, 137);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scan.next();
            boolean checkResult = isPrime(randomNumber);
            String rightAnswer = (checkResult) ? "yes" : "no";
            if (answer.equalsIgnoreCase("yes") && checkResult) {
                System.out.println("Correct!");
                countRightAnswer++;
            } else if (answer.equalsIgnoreCase("no") && !checkResult) {
                System.out.println("Correct!");
                countRightAnswer++;
            } else {
                Cli.looseMessage(answer, rightAnswer, username);
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
