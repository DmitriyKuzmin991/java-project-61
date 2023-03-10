package hexlet.code;

import hexlet.code.LibraryOfGames.GameTwoEven;
import hexlet.code.LibraryOfGames.GameThreeCalc;
import hexlet.code.LibraryOfGames.GameFourGCD;
import hexlet.code.LibraryOfGames.GameFiveProgression;
import hexlet.code.LibraryOfGames.GameSixPrime;

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
            case ("1") -> greetings();
            case ("2") -> GameTwoEven.gameTwoIsNumberEven();
            case ("3") -> GameThreeCalc.gameThreeCalc();
            case ("4") -> GameFourGCD.gameFourGCD();
            case ("5") -> GameFiveProgression.progression();
            case ("6") -> GameSixPrime.isPrimeGame();
            case ("0") -> System.out.println("Exit");
            default -> System.out.println("Error, please try again.");
        }
    }
    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scn = new Scanner(System.in);
        String userName = scn.next();
        System.out.println("Hello, " + userName + '!');
    }
}
