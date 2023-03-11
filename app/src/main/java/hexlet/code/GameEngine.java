package hexlet.code;

import hexlet.code.LibraryOfGames.GameTwoEven;
import hexlet.code.LibraryOfGames.GameThreeCalc;
import hexlet.code.LibraryOfGames.GameFourGCD;
import hexlet.code.LibraryOfGames.GameFiveProgression;
import hexlet.code.LibraryOfGames.GameSixPrime;

import java.util.Scanner;

public class GameEngine {
    public static final int COUNT_OF_ROUND = 3;

    //Движок содержит всю общую логику проведения игр: приветствие, отображение правил, отыгрыш раундов и их проверка
    public static void engineApp(String numberGame) {
        String userName = greetingsAndGetName();
        switch (numberGame) {
            case ("2") -> GameTwoEven.gameTwoRules();
            case ("3") -> GameThreeCalc.gameThreeRules();
            case ("4") -> GameFourGCD.gameFourRules();
            case ("5") -> GameFiveProgression.gameFiveRules();
            default -> GameSixPrime.gameSixRules();
        }
        int winRounds = 0;
        while (winRounds < COUNT_OF_ROUND) {
            String correctAnswer = startGame(numberGame);
            Scanner scan = new Scanner(System.in);
            String userAnswer = scan.nextLine();
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                winRounds++;
            } else {
                looseMessage(userAnswer, correctAnswer, userName);
                return;
            }
        }
        winMassage(userName);
    }

    public static String startGame(String numberGame) {
        switch (numberGame) {
            case ("2") -> {
                return GameTwoEven.gameTwoIsNumberEven();
            }
            case ("3") -> {
                return GameThreeCalc.gameThreeCalc();
            }
            case ("4") -> {
                return GameFourGCD.gameFourGCD();
            }
            case ("5") -> {
                return GameFiveProgression.progression();
            }
            case ("6") -> {
                return GameSixPrime.isPrimeGame();
            }
            default -> {
                return "no";
            }
        }
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
