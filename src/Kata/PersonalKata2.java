package Kata;

import java.util.Scanner;

public class PersonalKata2 {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        int temp = 0;
        Scanner sc = new Scanner(System.in);

        while (count != NUMBER_OF_QUESTIONS) {
            int randomNumber1 = (int) (Math.random() * 10);
            int randomNumber2 = (int) (Math.random() * 10);
            if (randomNumber1 < randomNumber2) {
                temp = randomNumber1;
                randomNumber1 = randomNumber2;
                randomNumber2 = temp;

                System.out.println(randomNumber1 + "-" + randomNumber2);
                int answer = sc.nextInt();
                if (randomNumber1 - randomNumber2 == answer) {
                    System.out.println("Correct Bro");
                    correctCount++;
                } else System.out.println("Wasiu Behave na! The correct answer for " + randomNumber1 + "-"
                        + randomNumber2 + "is" + (randomNumber1 - randomNumber2));
                count++;
                output += "\n" + randomNumber1 + "-" + randomNumber2 + "=" + answer + ((randomNumber1 - randomNumber2 == answer)
                        ? "Correct" : "Wrong");

            }
            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;


            System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
        }
    }
}