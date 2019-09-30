package Assessment;

import java.util.Scanner;

public class OpenDoorGame {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int doorChoice = 4;

        System.out.println("Please enter a door >>>");
        while (doorChoice >= 4) {
        System.out.println("Enter\n1- for the first door >>>\n2- for the second door >>>\n3- for the third door >>>");
            doorChoice = input.nextInt();

            if (doorChoice == 1) {

                System.out.println("Congrats, you now how a million dollars!!!");
            } else if (doorChoice == 2) {

                System.out.println("OH NO you've been eaten by a gator!!");
            } else if (doorChoice == 3) {

                System.out.println("There is nothing behind this door, better luck next time :(");
            }
        }

    }
}
