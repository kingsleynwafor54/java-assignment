import java.util.Scanner;
public class Printl{
public static void main(String... args){
int num1,num2,sum,product,difference,quotient;

Scanner mynum = new Scanner (System.in);

System.out.print("Please enter your number :");
 num1=mynum.nextInt();

System.out.print("Please enter your number :");
 num2 =mynum.nextInt();



sum= num1+num2;
product = num1*num2;
difference =num1-num2;
quotient=num1/num2;

System.out.printf("%d%n sum:", sum);
System.out.printf("%d%n product",product);
System.out.printf("%d%ndifference",difference);
System.out.printf("%d%ndivision",quotient);


}



}