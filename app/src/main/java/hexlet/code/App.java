package hexlet.code;



public class App {
    public static void main(String[] args) {
        String userName = "Player";
        while (true) {

            int resultChoiceGame = Cli.choiceGames();
            System.out.println();
            switch (resultChoiceGame) {
                case (1):
                    userName = Cli.greetings();
                    System.out.println();
                    continue;
                case(2):
                    LibraryOfGames.gameTwo(userName);
                    return;
                default:
                    return;
            }



        }





        //scan.close();
//        if (resultChoiceGame == 0) {
//            return;
//        } else if (resultChoiceGame == 1) {
//
//        } else {
//            System.out.println("Try agan");
//        }

//
//         switch (resultChoiceGame) {
//             case (1):
//                 //start game
//             case ()





    }
}
