package hexlet.code.LibraryOfGames;

import hexlet.code.Cli;

import java.util.Scanner;

public class GameTwoEven {
    public static void gameTwoIsNumberEven() {
        String userName = Cli.greetingsAndGetName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanGameTwo = new Scanner(System.in);
        int countRightAnswer = 0;
        while (countRightAnswer < 3) {
            int number = (int) (Math.random() * 100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanGameTwo.next();
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            if (number % 2 == 0 && userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                countRightAnswer++;
            } else if (number % 2 != 0 && userAnswer.equalsIgnoreCase(correctAnswer)) {
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
