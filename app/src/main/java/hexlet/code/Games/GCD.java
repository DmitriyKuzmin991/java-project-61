package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final int LIMIT_MAX_VALUE = 100;
    public static final int COUNT_OF_ROUND = 3;

    public static void gcd() {
        String[][] questAndAnswer = new String[COUNT_OF_ROUND][2];
        String rules = "Find the greatest common divisor of given numbers.";
        for (String[] round : questAndAnswer) {
            getATaskForTheRound(round);
        }
        Engine.runGame(rules, questAndAnswer);
    }

    static int findGCD(int firstValue, int secondValue) {
        int maxValue = Math.max(firstValue, secondValue);
        int minValue = Math.min(firstValue, secondValue);
        while (minValue != 0) {
            int temp = maxValue % minValue;
            maxValue = minValue;
            minValue = temp;
        }
        return maxValue;
    }
    static void getATaskForTheRound(String[] round) {
        int firstValue = (int) (Math.random() * LIMIT_MAX_VALUE);
        int secondValue = (int) (Math.random() * LIMIT_MAX_VALUE);
        round[0] = firstValue + " " + secondValue;
        round[1] = Integer.toString(findGCD(firstValue, secondValue));
    }
}
