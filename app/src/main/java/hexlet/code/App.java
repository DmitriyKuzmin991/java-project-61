package hexlet.code;
import hexlet.code.LibraryOfGames.*;


public class App {
    public static void main(String[] args) {

        int resultChoiceGame = Cli.choiceGames();
        System.out.println();
        switch (resultChoiceGame) {
            case (1):
                String userName = Cli.greetingsAndGetName();
                return;
            case(2):
                GameTwoEven.gameTwoIsNumberEven();
                return;
            case(3):
                GameThreeCalc.gameThreeCalc();
                return;
            case(4):
                GameFourGCD.gameFourGCD();
                return;
            case(5):
                GameFiveProgression.progression();
                return;
            default:
                return;
        }

    }
}
