package Excercises;

import java.util.Scanner;

public class EvenEntryLoop {

    public static void main(String[] args){

        int userChoice;
        boolean finished = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a even number 1 - 10 or 999 to exit the program >>>");
        userChoice = input.nextInt();

        while (!finished){
            if (userChoice == 999){
                System.out.println("See Ya!");
                finished = true;
            }
            else {
                if (userChoice % 2 == 0){
                    System.out.println("Good Job, enter another even number or 999 to exit >>>");
                }
                else {
                    System.out.println("Error! Please enter an even number or the number 999 to exit");
                }
                userChoice = input.nextInt();

            }
        }
    }

}
