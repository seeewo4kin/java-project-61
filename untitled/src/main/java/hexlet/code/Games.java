package hexlet.code;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.Random;

public class Games {
    public static void even() {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        int score = 0;

        if (score < 3) {
            for (int i = 0; i < 3; ) {

                int timeValue = Engine.randValue();
                System.out.println("Question: " + timeValue);
                String answer = scan.nextLine();
                String tmpansw = answer;
                if (timeValue % 2 == 0 && answer.equals("yes")) {
                    System.out.println("Correct!\n");
                    i++;
                } else if (timeValue % 2 != 0 && answer.equals("no")) {
                    System.out.println("Correct!\n");
                    i++;
                } else if (timeValue % 2 == 0 && answer != "yes") {
                    System.out.println("'" + tmpansw + "' " + "is wrong answer ;(. Correct answer was 'yes'.\n Let`s try again " + "" + Cli.getPlayerName());
                    i = 0;
                } else if (timeValue % 2 != 0 && answer != "no") {
                    System.out.println("'" + tmpansw + "' " + "is wrong answer ;(. Correct answer was 'no'. \n Let`s try again " + Cli.getPlayerName());
                    i = 0;
                }
            }
        }
        System.out.println("Congratulations, " + Cli.getPlayerName() + "!");
    }


    public static void Calc() {
        Scanner scan = new Scanner(System.in);
        for (int score = 0; score < 3; ) {

            int first = Engine.randValue20();
            int second = Engine.randValue20();
            int act = Engine.randCalcAct();
            int answer = 0;

            if (act == 0) {

                answer = first + second;
                System.out.println("Question: " + first + " + " + second + "\n");
                int playerAnswer = Integer.parseInt(scan.nextLine());
                int tmpansw = playerAnswer;
                if (tmpansw == answer) {
                    System.out.println("Correct!\n");
                    score++;
                } else if (tmpansw != answer) {
                    System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.\n");
                    score = 0;
                }
            } else if (act == 1) {

                answer = first - second;

                System.out.println("Question: " + first + " - " + second + "\n");
                int playerAnswer = Integer.parseInt(scan.nextLine());
                int tmpansw = playerAnswer;
                if (tmpansw == answer) {
                    System.out.println("Correct!\n");
                    score++;
                } else if (tmpansw != answer) {
                    System.out.println("'" + tmpansw + "' is wrong answer ;(. Correct answer was '" + answer + "'.\n"
                            + "\n" + "Let`s try again, " + Cli.getPlayerName() + "!");
                    score = 0;
                }
            } else if (act == 2) {

                answer = first * second;

                System.out.println("Question: " + first + " * " + second + "\n");
                int playerAnswer = Integer.parseInt(scan.nextLine());
                int tmpansw = playerAnswer;
                if (tmpansw == answer) {
                    System.out.println("Correct!\n");
                    score++;
                } else if (tmpansw != answer) {
                    System.out.println("'" + tmpansw + "' is wrong answer ;(. Correct answer was '" + answer + "'.\n"
                    + "\n" + "Let`s try again, " + Cli.getPlayerName() + "!");
                    score = 0;
                }
            }
        }
        System.out.println("Congratulations, " + Cli.getPlayerName() + "!");
    }
}


