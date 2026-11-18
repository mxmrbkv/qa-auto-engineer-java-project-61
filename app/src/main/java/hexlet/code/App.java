package hexlet.code;

import hexlet.games.Calc;
import hexlet.games.Even;
import hexlet.games.GCD;
import hexlet.games.Progression;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String choice = readInput();

        switch (choice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.runGame();
                break;
            case "3":
                Calc.runGame();
                break;
            case "4":
                GCD.runGame();
                break;
            case "5":
                Progression.runGame();
                break;
            case "0":
                break;
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
