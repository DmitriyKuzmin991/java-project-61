package hexlet.code.Games;
import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final int LIMIT_FIRST_VALUE = 123;
    private static final int LIMIT_SECOND_VALUE = 25;
    private static final int VARIANT_MATH_SIGN = 3;
    public static final int COUNT_OF_ROUND = 3;

    public static void calc() {
        String[][] questAndAnswer = new String[COUNT_OF_ROUND][2];
        String rules = "What is the result of the expression?";
        for (String[] round : questAndAnswer) {
            int firstValue = new Random().nextInt(LIMIT_FIRST_VALUE);
            int secondValue = new Random().nextInt(LIMIT_SECOND_VALUE);
            int mathSign = new Random().nextInt(VARIANT_MATH_SIGN);
            int correctAnswer;
            String sign;
            switch (mathSign) {
                case (0) -> {
                    sign = " + ";
                    correctAnswer = firstValue + secondValue;
                }
                case (1) -> {
                    sign = " - ";
                    correctAnswer = firstValue - secondValue;
                }
                default -> {
                    sign = " * ";
                    correctAnswer = firstValue * secondValue;
                }
            }
            round[0] = "Question: " + firstValue + sign + secondValue + "\nYour answer: ";
            round[1] = Integer.toString(correctAnswer);
        }
        Engine.runGame(rules, questAndAnswer);
    }
}
