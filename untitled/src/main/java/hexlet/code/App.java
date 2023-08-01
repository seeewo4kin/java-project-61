package hexlet.code;
import java.util.Scanner;
public class App {

    public static int gameChoice() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit""");
        return scanner.nextInt();
    }

    public static void main(String[] args) {

        App.choiceMenu();
    }

    public static void choiceMenu() {
        boolean end = true;


        do {
            switch (App.gameChoice()) {

                case 1:
                    System.out.println("""
                            Your choose: 1

                            Welcome to the Brain Games!""");
                    Cli.getPlayerName();
                    System.out.println("Hello, " + Cli.getPlayerName() + "!");

                    break;
                case 0:
                    System.out.println("Thanks for playing! Good Luck!");
                    System.exit(1);
                    end = false;
                case 2:
                    System.out.println("""
                            Your choose: 2

                            Welcome to the Brain Games!""");
                    Cli.getPlayerName();
                    Games.even();
                    break;
                case 3:
                    System.out.println("""
                            Your choose: 3

                            Welcome to the Brain Games!""");
                    Cli.getPlayerName();
                    Games.Calc();
                    break;
                case 4:
                    System.out.println("""
                            Your choose: 4

                            Welcome to the Brain Games!""");
                    Cli.getPlayerName();
                    Games.GCD();
                    break;
                }
            }
            while (end == true) ;
            System.exit(1);
    }
}


