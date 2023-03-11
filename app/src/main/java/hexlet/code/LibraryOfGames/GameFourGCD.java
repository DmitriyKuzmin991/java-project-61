package hexlet.code.LibraryOfGames;

public class GameFourGCD {
    private static final int LIMIT_MAX_VALUE = 100;
    public static String gameFourGCD() {
        int firstValue = (int) (Math.random() * LIMIT_MAX_VALUE);
        int secondValue = (int) (Math.random() * LIMIT_MAX_VALUE);
        System.out.println("Question: " + firstValue + " " + secondValue);
        System.out.print("Your answer: ");
        return  findGCD(firstValue, secondValue);
    }
    static String findGCD(int firstValue, int secondValue) {
        int maxValue = Math.max(firstValue, secondValue);
        int minValue = Math.min(firstValue, secondValue);
        while (minValue != 0) {
            int temp = maxValue % minValue;
            maxValue = minValue;
            minValue = temp;
        }
        return Integer.toString(maxValue);
    }
    public static void  gameFourRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }
}
