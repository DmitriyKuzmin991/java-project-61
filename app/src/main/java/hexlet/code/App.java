package hexlet.code;
import hexlet.code.LibraryOfGames.GameTwoEven;
import hexlet.code.LibraryOfGames.GameThreeCalc;
import hexlet.code.LibraryOfGames.GameFourGCD;
import hexlet.code.LibraryOfGames.GameFiveProgression;
import hexlet.code.LibraryOfGames.GameSixPrime;


public class App {
    public static void main(String[] args) {
        int resultChoiceGame = Cli.choiceGames();
        System.out.println();
        switch (resultChoiceGame) {
            case (1) -> Cli.greetings();
            case (2) -> GameTwoEven.gameTwoIsNumberEven();
            case (3) -> GameThreeCalc.gameThreeCalc();
            case (4) -> GameFourGCD.gameFourGCD();
            case (5) -> GameFiveProgression.progression();
            case (6) -> GameSixPrime.isPrimeGame();
            default -> {
            }
        }

    }
}
