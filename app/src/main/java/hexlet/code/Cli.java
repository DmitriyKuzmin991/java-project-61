package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static int choiceGames() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }
    public static String greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scn = new Scanner(System.in);
        String userName = scn.next();
        System.out.println("Hello, " + userName + '!');
        return userName;
    }

}
