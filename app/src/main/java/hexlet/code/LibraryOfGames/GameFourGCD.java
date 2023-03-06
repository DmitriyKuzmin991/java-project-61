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
            int gcd = findGCD(firstValue, secondValue);
            System.out.printf("Question: %s and %s", firstValue, secondValue);
            System.out.print("\nYour answer: ");
            int answer = scan.nextInt();
            if (answer == gcd) {
                System.out.println("Correct!");
                countRightAnswer++;
                continue;
            } else {
                Cli.looseMessage(answer, gcd, userName);
                return;
            }
        }
        Cli.winMassage(userName);
    }
    static int findGCD(int firstValue, int secondValue) {
        int maxValue = Math.max(firstValue, secondValue);
        int minValue = Math.min(firstValue, secondValue);
        while (minValue != 0) {
            int temp = maxValue % minValue;
            maxValue = minValue;
            minValue = temp;
        }
        return maxValue;
    }
}
