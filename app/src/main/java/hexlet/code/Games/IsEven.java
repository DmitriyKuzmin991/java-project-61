package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class IsEven {
    private static final int UPPER_LIMIT_NUMBER = 99;
    public static final int COUNT_OF_ROUND = 3;
    public static void  isEven() {
        String[][] questAndAnswer = new String[COUNT_OF_ROUND][2];
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        for (String[] round : questAndAnswer) {
            int number = new Random().nextInt(UPPER_LIMIT_NUMBER);
            round[0] = "Question: " + number + "\nYour answer: ";
            round[1] = (verificationIsEven(number)) ? "yes" : "no";
        }
        Engine.runGame(rules, questAndAnswer);
    }
    static boolean verificationIsEven(int number) {
        return number % 2 == 0;
    }
}
