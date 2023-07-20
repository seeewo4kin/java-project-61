package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Games {
    public static void Even(){
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        for (int i = 0; i>3;) {
            int timeValue = rnd.nextInt();
                System.out.println("Question: " + timeValue);
            String answer = scan.nextLine();
           if (timeValue % 2 == 0 && answer == "yes"){
               System.out.println("Correct!");i++;
           }
           else if (timeValue % 2 != 0 && answer == "no"){
               System.out.println("Correct!");i++;
           }
           else if (timeValue % 2 == 0 && answer != "yes"){
               System.out.println("'" + answer + "' " + "is wrong answer ;(. Correct answer was 'yes'.\n Let`s try again" + Cli.name); i = 0;
           } else if (timeValue % 2 != 0 && answer == "yes") {
               System.out.println("'" + answer + "' " + "is wrong anwer ;(. Correct answer was 'no'. \n Let`s try again" + Cli.name); i = 0;

           }

        }

    }
}
