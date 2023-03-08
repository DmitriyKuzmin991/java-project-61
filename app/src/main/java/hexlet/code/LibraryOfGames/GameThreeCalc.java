package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;
import hexlet.code.GameEngine;

import java.util.Scanner;

public class GameThreeCalc {
    public static void gameThreeCalc() {
        String userName = Cli.greetingsAndGetName();
        int countRightAnswer = 0;
        int resultForVictory = GameEngine.countOfRound();
        while (countRightAnswer < resultForVictory) {
            int firstValue = GameEngine.getRandomValue(5, 113);
            int secondValue = GameEngine.getRandomValue(2, 20);
            int mathSignRandom = GameEngine.getRandomValue(1, 4);
            int correctAnswer;
            System.out.println("What is the result of the expression?");
            System.out.print("Question: ");
            switch (mathSignRandom) {
                case (1) -> {
                    System.out.println(firstValue + " + " + secondValue);
                    correctAnswer = firstValue + secondValue;
                }
                case (2) -> {
                    System.out.println(firstValue + " - " + secondValue);
                    correctAnswer = firstValue - secondValue;
                }
                default -> {
                    System.out.println(firstValue + " * " + secondValue);
                    correctAnswer = firstValue * secondValue;
                }
            }
            System.out.print("Your answer: ");
            Scanner scan = new Scanner(System.in);
            int userAnswer = scan.nextInt();
            if (correctAnswer == userAnswer) {
                System.out.println("Correct!");
                countRightAnswer++;
            } else {
                Cli.looseMessage(userAnswer, correctAnswer, userName);
                return;
            }
        }
        Cli.winMassage(userName);
    }
}
