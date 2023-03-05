package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Scanner;

public class GameFourGCD {
    public static void gameFourGCD() {
        String userName = Cli.greetingsAndGetName();
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scan = new Scanner(System.in);
        int countRightAnswer = 0;
        while (countRightAnswer < 3) {
            int firstValue = (int) (Math.random() * 100);
            int secondValue = (int) (Math.random() * 100);
            int halfMaxValue = Math.max(firstValue, secondValue) / 2;
            int gcd = 0;
            for (int i = halfMaxValue; i > 0; i--) {
                if (firstValue % i == 0 && secondValue % i == 0) {
                    gcd = i;
                    break;
                }
            }
            System.out.printf("Question: %s and %s", firstValue ,secondValue);
            System.out.print("\nYour answer: ");
            int answer = scan.nextInt();
            if (answer == gcd) {
                System.out.println("Correct!");
                countRightAnswer++;
                continue;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n",answer, gcd);
                System.out.printf("Let's try again, %s!", userName);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", userName);
    }
}
