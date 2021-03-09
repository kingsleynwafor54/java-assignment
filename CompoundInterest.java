import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        int counter;
        int rate=0;
        int principal=1000;
        int year=5;
        double amount;
        Scanner sc=new Scanner(System.in);
        for(counter=1;counter<=6;counter++){
            System.out.println("Input your rate");
            rate=sc.nextInt();
            amount=principal*Math.pow (1+rate,year);
            System.out.println(amount);
        }
    }
}