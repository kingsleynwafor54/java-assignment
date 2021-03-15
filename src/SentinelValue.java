
    import java.util.Scanner;
    public class SentinelValue {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
               int data=1;
                int sum = 0;
                while (data != 0) {
                    System.out.print("Enter an int value (the program exits if the input is 0): ");
                     data = input.nextInt();

                    sum += data;

                }

                System.out.println("The sum is " + sum);
            }
        }
