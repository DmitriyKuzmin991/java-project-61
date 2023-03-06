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
            int firstValue = (int) (Math.random() * 100 + 3);
            int secondValue = (int) (Math.random() * 100 + 3);
            int correctAnswer = findGCD(firstValue, secondValue);
            System.out.printf("Question: %s and %s", firstValue, secondValue);
            System.out.print("\nYour answer: ");
            int userAnswer = scan.nextInt();
            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                countRightAnswer++;
            } else {
                Cli.looseMessage(userAnswer, correctAnswer, userName);
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
