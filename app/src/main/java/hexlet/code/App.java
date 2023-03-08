package hexlet.code;



public class App {
    public static void main(String[] args) {
        int resultChoiceGame = Cli.choiceGames();
        System.out.println();
        GameEngine.gameStarter(resultChoiceGame);

    }
}
