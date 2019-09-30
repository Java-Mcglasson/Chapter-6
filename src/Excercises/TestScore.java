package Excercises;

import java.util.Scanner;

public class TestScore {

    public static void main(String[] args){

        int numberOfEnterys = 0;
        int high = 0;
        int low = 100;
        int avg;
        int scoreTotal = 0;
        int userEntry = 0;

        Scanner input = new Scanner(System.in);

        while (userEntry != 999){
            System.out.println("Please Enter the Test Score >>>");
            userEntry = input.nextInt();

            if (userEntry > high && userEntry <= 100){

                System.out.println("You're a smart cookie");
            }
            else if (userEntry < low && userEntry >= 0){
                System.out.println("Someone might be on the slow side");
            }
            else{
                System.out.println("Error!");
            }
            numberOfEnterys++;
            scoreTotal = scoreTotal + userEntry;
        }

    }

}
