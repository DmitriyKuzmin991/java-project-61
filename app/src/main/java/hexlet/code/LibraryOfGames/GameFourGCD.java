package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;
import hexlet.code.GameEngine;

import java.util.Scanner;

public class GameFourGCD {
    public static void gameFourGCD() {
        String userName = Cli.greetingsAndGetName();
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scan = new Scanner(System.in);
        int countRightAnswer = 0;
        int resultForVictory = GameEngine.countOfRound();
        while (countRightAnswer < resultForVictory) {
            int firstValue = GameEngine.getRandomValue(3, 113);
            int secondValue = GameEngine.getRandomValue(3, 113);
            int correctAnswer = findGCD(firstValue, secondValue);
            System.out.print("Question: " + firstValue + " " + secondValue);
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
