package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Scanner;

public class GameThreeCalc {
    public static void gameThreeCalc() {
        String userName = Cli.greetingsAndGetName();
        int countRightAnswer = 0;
        while (countRightAnswer < 3) {
            int firstValue = (int) (Math.random() * 100);
            int secondValue = (int) (Math.random() * 20);
            int mathSignRand = (int) (Math.random() * 3 + 1);
            int result = 0;
            System.out.println("What is the result of the expression?");
            System.out.print("Question: ");
            switch (mathSignRand) {
                case(1):
                    System.out.println(firstValue + " + " + secondValue);
                    result = firstValue + secondValue;
                    break;
                case(2):
                    System.out.println(firstValue + " - " + secondValue);
                    result = firstValue - secondValue;
                    break;
                default:
                    System.out.println(firstValue + " * " + secondValue);
                    result = firstValue * secondValue;
            }
            System.out.print("Your answer: ");
            Scanner scan = new Scanner(System.in);
            int answer = scan.nextInt();
            if (result == answer) {
                System.out.println("Correct!");
                countRightAnswer++;
                continue;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n", answer, result);
                System.out.printf("Let's try again, %s!\n", userName);
                return;
            }
        }
        System.out.printf("Congratulations, %s!", userName);
        System.out.println();
        return;
    }
}
