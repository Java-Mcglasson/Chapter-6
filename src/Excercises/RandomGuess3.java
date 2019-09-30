package Excercises;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int choice = 999;
        int counter = 0;
        int rand_pick = rand.nextInt(100) + 1;

        while (choice != rand_pick) {
            System.out.println("Please guess a number between 1 - 100");
            choice = input.nextInt();

            if (choice == rand_pick) {
                System.out.println("Congrats, You're a good guesser");
            }
            else if (choice > rand_pick) {
                System.out.println("Nope it was lower");
            }
            else if (choice < rand_pick) {
                System.out.println("Nope it was higher");
            }
            counter++;
        }
        System.out.println("It took you " + counter +
                " chances to guess the right number!");
    }
}
