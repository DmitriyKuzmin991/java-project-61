package hexlet.code;



public class App {
    public static void main(String[] args) {

        int resultChoiceGame = Cli.choiceGames();
        System.out.println();
        switch (resultChoiceGame) {
            case (1):
                String userName = Cli.greetingsAndGetName();
                System.out.println();
                return;
            case(2):
                LibraryOfGames.gameTwoIsNumberEven();
                return;
            case(3):
                LibraryOfGames.gameThreeCalc();
                return;
            default:
                return;
        }

    }
}
