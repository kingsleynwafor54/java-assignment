package Kata;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int systemNumber=55;
        for(int counter=0;counter!=systemNumber;counter++){
            System.out.println("Enter your guessed Number");
            int guessNumber=sc.nextInt();
            if(systemNumber==guessNumber){
                System.out.println("correct");
                break;
            }
        else if (guessNumber>systemNumber){
                System.out.println("To high");
            }
        else if (guessNumber<systemNumber){
                System.out.println("To low");
            }
        else System.out.println("Incorrect");
        }
    }

}
