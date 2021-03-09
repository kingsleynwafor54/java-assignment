import java.util.Scanner;

public class NewLife {
    public static void main(String[] args) {
        int counter = 0;
        int smallest = 0;


        Scanner sc = new Scanner(System.in);
        while (counter <= 3) {
            System.out.println("Please enter your number");
            int number = sc.nextInt();
            if (counter == 0) {
                smallest = number;

            }
                if (number <smallest)
                    smallest = number;


                System.out.println("The smallest number is " + smallest);
                counter++;
            }
        }
    }
