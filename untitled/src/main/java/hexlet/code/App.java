package hexlet.code;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" + "1 - Greet\n" + "0 - Exit");
        switch (scanner.nextInt()) {

            case 1:
                System.out.println("Your choise: 1\n" + "\n" +
                        "Welcome to the Brain Games!");
                Cli.askName();
                break;
            case 0:
                System.out.println("Thanks for playing! Good Luck!");
                break;
            case 2:
                System.out.println("Your choise: 2\n" + "\n" +
                        "Welcome to the Brain Games!");
                    Cli.askName();
                 System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'. ");
        }


    }
}
