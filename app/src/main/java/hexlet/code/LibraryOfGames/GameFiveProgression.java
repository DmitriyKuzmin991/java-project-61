package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;
import hexlet.code.GameEngine;

import java.util.Scanner;

public class GameFiveProgression {
    public static void progression() {
        String userName = Cli.greetingsAndGetName();
        System.out.println("What number is missing in the progression?");
        Scanner scan = new Scanner(System.in);
        int countRightAnswer = 0;
        int resultForVictory = GameEngine.countOfRound();
        while (countRightAnswer < resultForVictory) {
            int startNumber = GameEngine.getRandomValue(6, 14);
            int stepProgression = GameEngine.getRandomValue(3, 8);
            int hiddenPosition = GameEngine.getRandomValue(1, 11);
            int hiddenValue = startNumber + (stepProgression * hiddenPosition);
            int lengthProgression = 10;
            System.out.print("Question: ");
            printProgression(startNumber, stepProgression, hiddenPosition, lengthProgression);
            System.out.print("\nYour answer: ");
            int userAnswer = scan.nextInt();
            if (userAnswer == hiddenValue) {
                System.out.println("Correct!");
                countRightAnswer++;
            } else {
                Cli.looseMessage(userAnswer, hiddenValue, userName);
                return;
            }
        }
        Cli.winMassage(userName);
    }
    static void printProgression(int start, int stepProgression, int hiddenPosition, int length) {
        for (int i = 0, j = start; i <= length; i++) {
            if (i == hiddenPosition) {
                System.out.print(" ..");
            } else {
                System.out.printf(" %s", j);
            }
            j += stepProgression;
        }
    }

}
