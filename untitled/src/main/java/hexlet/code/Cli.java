
package hexlet.code;

import java.util.Scanner;

public class Cli {

    static String playerName = "";

    public static String setPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, how can i call you?");
        String name = scanner.nextLine();
        Cli.playerName = name;

        return Cli.playerName;
    }
    public static String getPlayerName() {

        if (Cli.playerName.equals("")) {

            Cli.setPlayerName();
        }
        return playerName;
    }

}
