package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void askName() {

        Scanner s = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = s.nextLine();
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);




    }
}
