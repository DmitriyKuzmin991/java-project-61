package hexlet.code.LibraryOfGames;
import java.util.Random;

public class GameThreeCalc {
    private static final int LIMIT_FIRST_VALUE = 123;
    private static final int LIMIT_SECOND_VALUE = 25;
    private static final int VARIANT_MATH_SIGN = 3;

    public static String gameThreeCalc() {
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
        System.out.print("Question: ");
        System.out.println(firstValue + sign + secondValue);
        System.out.print("Your answer: ");
        return Integer.toString(correctAnswer);
    }
    public static void  gameThreeRules() {
        System.out.println("What is the result of the expression?");
    }
}
