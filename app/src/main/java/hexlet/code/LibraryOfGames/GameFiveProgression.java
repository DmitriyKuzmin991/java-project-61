package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Scanner;

public class GameFiveProgression {
    public static void progression() {
        String userName = Cli.greetingsAndGetName();
        System.out.println("What number is missing in the progression?");
        Scanner scan = new Scanner(System.in);
        int countRightAnswer = 0;
        while (countRightAnswer < 3) {
            int start = (int) (Math.random() * 4 + 3);
            int stepProgression = (int) (Math.random() * 4 + 3);
            int hiddenPosition = (int) (Math.random() * 10);
            int hiddenValue = start + (stepProgression * hiddenPosition);
            System.out.print("Question: ");
            printProgression(start, stepProgression, hiddenPosition);
            System.out.print("\nYour answer: ");
            int answer = scan.nextInt();
            if (answer == hiddenValue) {
                System.out.println("Correct!");
                countRightAnswer++;
            } else {
                Cli.looseMessage(answer, hiddenValue, userName);
                return;
            }
        }
        Cli.winMassage(userName);
    }
    static void printProgression(int start, int stepProgression, int hiddenPosition) {
        for (int i = 0, j = start; i < 10; i++) {
            if (i == hiddenPosition) {
                System.out.print(" .. ");
            } else {
                System.out.printf(" %s ", j);
            }
            j += stepProgression;
        }
    }

}
