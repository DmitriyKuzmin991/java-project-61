package hexlet.code;

import hexlet.code.LibraryOfGames.GameTwoEven;
import hexlet.code.LibraryOfGames.GameThreeCalc;
import hexlet.code.LibraryOfGames.GameFourGCD;
import hexlet.code.LibraryOfGames.GameFiveProgression;
import hexlet.code.LibraryOfGames.GameSixPrime;
public class GameEngine {
    public static final int COUNT_OF_ROUND = 3;

    public static void engineApp(String numberGame) {
        switch (numberGame) {
            case ("1") -> Cli.greetings();
            case ("2") -> gameBody("two");
            case ("3") -> gameBody("three");
            case ("4") -> gameBody("four");
            case ("5") -> gameBody("five");
            case ("6") -> gameBody("six");
            case ("0") -> System.out.println("Exit");
            default -> System.out.println("Selection error, please try again.");
        }
    }

    public static void gameBody(String numberGame) {
        String userName = Cli.greetingsAndGetName();
        int countRightAnswer = 0;
        rulesOfTheGame(numberGame);
        while (countRightAnswer < COUNT_OF_ROUND) {
            boolean result = gameStarter(numberGame, userName);
            if (!result) {
                return;
            }
            System.out.println("Correct!");
            countRightAnswer++;
        }
        Cli.winMassage(userName);
    }

    public static void rulesOfTheGame(String numberGame) {
        switch (numberGame) {
            case ("two") -> GameTwoEven.gameTwoRules();
            case ("three") -> GameThreeCalc.gameThreeRules();
            case ("four") -> GameFourGCD.gameFourRules();
            case ("five") -> GameFiveProgression.gameFiveRules();
            case ("six") -> GameSixPrime.gameSixRules();
            default -> {
            }
        }
    }

    public static boolean gameStarter(String numberGame, String user) {
        boolean result = false;
        switch (numberGame) {
            case ("two") -> {
                return GameTwoEven.gameTwoIsNumberEven(user);
            }
            case ("three") -> {
                return GameThreeCalc.gameThreeCalc(user);
            }
            case ("four") -> {
                return GameFourGCD.gameFourGCD(user);
            }
            case ("five") -> {
                return GameFiveProgression.progression(user);
            }
            case ("six") -> {
                return GameSixPrime.isPrimeGame(user);
            }
            default -> {
                return result;
            }
        }
    }
}
