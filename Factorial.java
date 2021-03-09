import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fact = 1;
        int counter = 1;
        int number;
        do {
            System.out.println("Input number");
            number = sc.nextInt();

            for (; counter <= number; counter++) {

                fact = fact * counter;


            }

            System.out.println(fact);
        }while(number!=-1);
    }
}