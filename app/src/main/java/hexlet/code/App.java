package hexlet.code;

import hexlet.code.Games.IsEven;
import hexlet.code.Games.Calc;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Progression;
import hexlet.code.Games.IsPrime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
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
        String userChoice = scan.nextLine();
        switch (userChoice) {
            case ("1") -> Cli.greetings();
            case ("2") -> IsEven.isEven();
            case ("3") -> Calc.calc();
            case ("4") -> GCD.gcd();
            case ("5") -> Progression.progression();
            case ("6") -> IsPrime.isPrime();
            case ("0") -> System.out.println("Exit");
            default -> System.out.println("Error, please try again.");
        }
    }
}
