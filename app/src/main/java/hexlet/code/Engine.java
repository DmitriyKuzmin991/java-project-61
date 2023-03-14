package hexlet.code;
import java.util.Scanner;

public class Engine {

    public static void runGame(String gameRules, String[][] questionAndAnswer) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scn = new Scanner(System.in);
        String userName = scn.nextLine();
        System.out.println("Hello, " + userName + '!');
        System.out.println(gameRules);
        for (String[] round : questionAndAnswer) {
            System.out.print(round[0]);
            String userAnswer = scn.nextLine();
            if (!userAnswer.equalsIgnoreCase(round[1])) {
                showFailMassage(userAnswer, round[1], userName);
                return;
            }
            System.out.println("Correct!");
        }
        showWinMassage(userName);
    }

    public static void showFailMassage(String userAnswer, String correctAnswer, String userName) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n", userAnswer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", userName);
    }
    public static void showWinMassage(String userName) {
        System.out.printf("Congratulations, %s!\n", userName);
    }
}
