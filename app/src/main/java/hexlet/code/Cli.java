package hexlet.code;
import java.util.Scanner;
public class Cli {

    public static void greetings() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scn = new Scanner(System.in);
        String userName = scn.next();
        System.out.println("Hello, " + userName + '!');
        scn.close();
    }
}

    /*make run-dist
        Welcome to the Brain Games!
        May I have your name? John
        Hello, John!
        После чего программа завершается.*/