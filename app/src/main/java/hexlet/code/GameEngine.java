package hexlet.code;
import java.util.Scanner;

public class GameEngine {
    public static final int COUNT_OF_ROUND = 3;

    //Движок содержит всю общую логику проведения игр: приветствие, отображение правил, отыгрыш раундов и их проверка
    public static void engineApp(String gameRules, String[] question, String[] rightAnswer) {
        String userName = greetingsAndGetName();
        System.out.println(gameRules);
        Scanner scan = new Scanner(System.in);
        int gameRounds = 0;
        while (gameRounds < COUNT_OF_ROUND) {
            System.out.print(question[gameRounds]);
            String userAnswer = scan.nextLine();
            if (userAnswer.equalsIgnoreCase(rightAnswer[gameRounds])) {
                System.out.println("Correct!");
                gameRounds++;
            } else {
                looseMessage(userAnswer, rightAnswer[gameRounds], userName);
                return;
            }
        }
        winMassage(userName);
    }

    public static String greetingsAndGetName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scn = new Scanner(System.in);
        String userName = scn.next();
        System.out.println("Hello, " + userName + '!');
        return userName;
    }
    public static void looseMessage(String userAnswer, String correctAnswer, String userName) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n", userAnswer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", userName);
    }
    public static void winMassage(String userName) {
        System.out.printf("Congratulations, %s!\n", userName);
    }
}
