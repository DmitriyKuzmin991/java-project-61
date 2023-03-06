package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Scanner;

public class GameThreeCalc {
    public static void gameThreeCalc() {
        String userName = Cli.greetingsAndGetName();
        int countRightAnswer = 0;
        while (countRightAnswer < 3) {
            int firstValue = (int) (Math.random() * 100 + 3);
            int secondValue = (int) (Math.random() * 20 + 1);
            int mathSignRandom = (int) (Math.random() * 3 + 1);
            int correctAnswer = 0;
            System.out.println("What is the result of the expression?");
            System.out.print("Question: ");
            switch (mathSignRandom) {
                case(1):
                    System.out.println(firstValue + " + " + secondValue);
                    correctAnswer = firstValue + secondValue;
                    break;
                case(2):
                    System.out.println(firstValue + " - " + secondValue);
                    correctAnswer = firstValue - secondValue;
                    break;
                default:
                    System.out.println(firstValue + " * " + secondValue);
                    correctAnswer = firstValue * secondValue;
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
