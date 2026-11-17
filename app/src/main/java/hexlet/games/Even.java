package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String DESCRIPTION =
            "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            roundsData[i][0] = String.valueOf(number);
            roundsData[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.run(DESCRIPTION, roundsData);
    }
}
