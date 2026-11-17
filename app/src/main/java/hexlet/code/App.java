package hexlet.code;

import hexlet.games.Even;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        String choice = readInput();

        switch (choice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.runGame();
            default:
                break;
        }
    }

    private static String readInput() {
        try {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = System.in.read()) != -1) {
                if (c == '\n') {
                    break;
                }
                if (c != '\r') {
                    sb.append((char) c);
                }
            }
            return sb.toString().trim();
        } catch (IOException e) {
            return "";
        }
    }
}
