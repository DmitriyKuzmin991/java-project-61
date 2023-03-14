package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scn = new Scanner(System.in);
        String userName = scn.next();
        System.out.println("Hello, " + userName + '!');
    }
}

