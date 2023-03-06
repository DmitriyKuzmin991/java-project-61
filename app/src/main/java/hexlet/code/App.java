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
            case (1):
                Cli.greetings();
                break;
            case(2):
                GameTwoEven.gameTwoIsNumberEven();
                break;
            case(3):
                GameThreeCalc.gameThreeCalc();
                break;
            case(4):
                GameFourGCD.gameFourGCD();
                break;
            case(5):
                GameFiveProgression.progression();
                break;
            case(6):
                GameSixPrime.isPrimeGame();
                break;
            default:
                break;
        }

    }
}
