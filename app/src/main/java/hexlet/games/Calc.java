package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 50;

    public static int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int num1 = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            int num2 = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            char operator = OPERATORS[Utils.getRandomInt(0, OPERATORS.length - 1)];

            roundsData[i][0] = num1 + " " + operator + " " + num2;
            roundsData[i][1] = String.valueOf(calculate(num1, num2, operator));
        }
        Engine.run(DESCRIPTION, roundsData);
    }
}
