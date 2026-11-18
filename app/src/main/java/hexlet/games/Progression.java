package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_START = 1;
    private static final int MAX_START = 20;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;

    public static String[] makeProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int length = Utils.getRandomInt(MIN_LENGTH, MAX_LENGTH);
            int start = Utils.getRandomInt(MIN_START, MAX_START);
            int step = Utils.getRandomInt(MIN_STEP, MAX_STEP);
            String[] progression = makeProgression(start, step, length);
            int hiddenIndex = Utils.getRandomInt(0, length - 1);

            roundsData[i][1] = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            roundsData[i][0] = String.join(" ", progression);
        }
        Engine.run(DESCRIPTION, roundsData);
    }
}
