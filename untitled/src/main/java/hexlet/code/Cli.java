package hexlet.code;

import java.util.Scanner;

public class Cli {

    static final String playerName = Cli.setPlayerName();

    public static String setPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, how can i call you?");
        String name = scanner.nextLine();
        return name;
    }
    public static String getPlayerName(){
      return playerName;
    }

}
