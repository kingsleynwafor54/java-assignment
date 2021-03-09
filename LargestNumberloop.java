import java.util.Scanner;

public class LargestNumberloop {
    public static void main(String[] args) {

        int counter=0;
        int oddNumber=1;

Scanner sc = new Scanner(System.in);
            do{
                System.out.println("enter number");
                oddNumber= sc.nextInt();
                oddNumber = oddNumber+1;
                System.out.println("The total number is " + oddNumber);
                counter+=2;
            }while (counter<=15);

        System.out.println(1+3+5+7+9+11+13+15);
    }
}