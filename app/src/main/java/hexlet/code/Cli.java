package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static int choiceGames() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static String greetingsAndGetName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scn = new Scanner(System.in);
        String userName = scn.next();
        System.out.println("Hello, " + userName + '!');
        return userName;
    }
    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scn = new Scanner(System.in);
        String userName = scn.next();
        System.out.println("Hello, " + userName + '!');
    }
    public static void winMassage(String userName) {
        System.out.printf("Congratulations, %s!\n", userName);
    }
    public static void looseMessage(int answer, int correctAnswer, String userName) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n", answer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", userName);
    }
    public static void looseMessage(String answer, String correctAnswer, String userName) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n", answer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", userName);
    }
}

