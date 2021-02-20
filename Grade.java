import java.util.Scanner;
public class Grade{

public static void main(String... args){

double userScore;
Scanner input = new Scanner(System.in);

System.out.print("Enter userScore");
userScore=input.nextDouble();


if(userScore >=0 && userScore <=39){
System.out.print("failed");
}


if(userScore >40){
System.out.print("pass");
}



}

}