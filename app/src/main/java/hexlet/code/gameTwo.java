package hexlet.code;



import java.util.Scanner;

public class gameTwo {
    static void gameTwo(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scangameTwo = new Scanner(System.in);
        boolean isEven;
        int countRightAnswer = 0;
        while (countRightAnswer < 3) {
            int number = (int) (Math.random() * 100);
            System.out.println("Question = " + number);
            System.out.print("Your answer: ");
            String answer = scangameTwo.next();
            if (number % 2 == 0 && answer.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
                countRightAnswer++;
                continue;
            } else if (number % 2 != 0 && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
                countRightAnswer++;
                continue;
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.)");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
