package Excercises;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        String result;
        int user = 0;
        int countWin = 0;
        int countLose = 0;
        int countTie = 0;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        result = "Welcome to Rock Paper Scissors";
        displayPrint(result);

        while (user != 999) {
            int r = rand.nextInt(3) + 1;
            result = "Choose the following \n1: Rock \n2: Paper \n3: Scissors \nQuit: 999";
            displayPrint(result);
            user = input.nextInt();
            if (user == 1) {
                if (r == 1) {
                    result = "You Tie";
                    countTie++;
                } else if (r == 2) {
                    result = "You Lose";
                    countLose++;
                } else {
                    result = "You Win";
                    countWin++;
                }
                displayPrint(result);
            } else if (user == 2) {
                if (r == 2) {
                    result = "You Tie";
                    countTie++;
                } else if (r == 3) {
                    result = "You Lose";
                    countLose++;
                } else {
                    result = "You Win";
                    countWin++;
                }
                displayPrint(result);
            } else if (user == 3) {
                if (r == 3) {
                    result = "You Tie";
                    countTie++;
                } else if (r == 2) {
                    result = "You Win";
                    countWin++;
                } else {
                    result = "You Lose";
                    countLose++;
                }
                displayPrint(result);
            }

        }
        System.out.println("You won " + countWin + " times while playing today.");
        System.out.println("You lost " + countLose + " times while playing today.");
        System.out.println("You tied " + countTie + " time while playing today.");
    }

    public static void displayPrint(String result){
        System.out.println(result);
    }

}



