package hexlet.code;
import java.util.Scanner;
public class App {

    public static int gameChoice(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter." +
                "\n" + "1 - Greet" +
                "\n" + "2 - Even" +
                "\n" + "3 - Calc" +
                "\n" + "0 - Exit");
        int choice = scanner.nextInt();
        return choice;
    }

    public static void main(String[] args) {

            App.choiceMenu();
    }

    public static void choiceMenu() {
        boolean end = true;


        do {
            switch (App.gameChoice()) {

                case 1:
                    System.out.println("Your choise: 1\n" + "\n" +
                            "Welcome to the Brain Games!");
                    Cli.getPlayerName();
                    System.out.println("Hello, " + Cli.getPlayerName() + "!");

                    break;
                case 0:
                    System.out.println("Thanks for playing! Good Luck!");
                    System.exit(1);
                    end = false;
                case 2:
                    System.out.println("Your choise: 2\n" + "\n" +
                            "Welcome to the Brain Games!");
                    Cli.getPlayerName();
                    Games.even();
                    break;
                case 3:
                    System.out.println("Your choise: 3\n" + "\n" +
                            "Welcome to the Brain Games!");
                    Cli.getPlayerName();
                    Games.Calc();
                    break;
            }
        }while (end == true) ;
        System.exit(1);
    }
}



