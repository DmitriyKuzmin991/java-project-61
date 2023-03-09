package hexlet.code;



public class App {
    public static void main(String[] args) {
        String resultChoiceGame = Cli.choiceGames();
        System.out.println();
        GameEngine.engineApp(resultChoiceGame);

    }
}
