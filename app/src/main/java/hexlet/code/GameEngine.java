package hexlet.code;

import hexlet.code.LibraryOfGames.GameTwoEven;
import hexlet.code.LibraryOfGames.GameThreeCalc;
import hexlet.code.LibraryOfGames.GameFourGCD;
import hexlet.code.LibraryOfGames.GameFiveProgression;
import hexlet.code.LibraryOfGames.GameSixPrime;

import java.util.Random;

public class GameEngine {
    public static void gameStarter(int numberGame) {
        switch (numberGame) {
            case (1) -> Cli.greetings();
            case (2) -> GameTwoEven.gameTwoIsNumberEven();
            case (3) -> GameThreeCalc.gameThreeCalc();
            case (4) -> GameFourGCD.gameFourGCD();
            case (5) -> GameFiveProgression.progression();
            case (6) -> GameSixPrime.isPrimeGame();
            case (0) -> System.out.println("Exit");
            default -> System.out.println("Selection error, please try again.");
        }
    }
    public static int countOfRound() {
        return  3;
    }
    public static int getRandomValue(int initialValue, int finalValue) {
        return new Random().nextInt(initialValue, finalValue);
    }

}
