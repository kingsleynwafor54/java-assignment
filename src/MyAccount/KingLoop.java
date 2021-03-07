package MyAccount;
import java.util.Scanner;
public class KingLoop {
    public static void main(String[] args) {
        double trip =0;
        double miles=1;
        double gallons =1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter miles");
            miles = sc.nextDouble();
            System.out.println("enter gallons");
            gallons = sc.nextDouble();
            if (gallons > 0 && miles > 0) {
                trip = miles / gallons;


            }
            System.out.println(trip + "m/g");
        }    while (miles != -1) ;

    }
}
