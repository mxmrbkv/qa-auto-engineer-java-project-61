package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int num1 = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            int num2 = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);

            roundsData[i][0] = num1 + " " + num2;
            roundsData[i][1] = String.valueOf(gcd(num1, num2));
        }
        Engine.run(DESCRIPTION, roundsData);
    }
}
