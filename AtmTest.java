import java.util.Scanner;

public class AtmTest {
    public static void main(String[] args) {

        int displayOption = 0;


        int counter = 0;


        Scanner sc = new Scanner(System.in);
        int enteredPin;


        for(;counter<3;counter++) {


            Atm kingsleyCard = new Atm(0.0, 1233);

            int userPin = kingsleyCard.getPin();
            System.out.println("Please enter your pin");
            enteredPin = sc.nextInt();


            if (userPin == enteredPin) {

                do {
                    System.out.println("welcome  to KingsBank");


                    String Prompt = """
                            ->Press 1 for Withdrawal
                            ->Press 2 for Transfer
                            -Press  3 to Buy airtime
                            ->Press 4 for checkBalance
                            -> Press 5 for change pin;
                            ->Press 6 for deposit;
                            ->Press -1 to exit transaction
                            """;
                    System.out.println(Prompt);
                    System.out.println("enter your preferred option");
                    displayOption = sc.nextInt();

                    switch (displayOption) {

                        case 1 -> {
                            System.out.println("enter your withdrawal amount");
                            double amount = sc.nextDouble();
                            System.out.println(amount);
                            kingsleyCard.withdrawal(amount);
                            System.out.println("You current account balance is " + kingsleyCard.getBalance());

                        }
                        case 2 -> {
                            System.out.println("enter your transfer Amount");
                            double transfer = sc.nextDouble();
                            System.out.println(transfer);
                            //   kingsleyCard.transfer(transfer);
                            System.out.println("Your current account balance is " + kingsleyCard.getBalance());

                        }
                        case 3 -> {
                            System.out.println("enter your Airtime Amount");
                            int airtime = sc.nextInt();
                            System.out.println(airtime);
                            kingsleyCard.buyAirtime(airtime);
                            System.out.println("Your current account balance is " + kingsleyCard.getBalance());

                        }
                        case 4 -> System.out.println("Your account balance is :" + kingsleyCard.getBalance());
                        case 5 -> {
                            System.out.println("enter new pin");
                            int newPin = sc.nextInt();
                            kingsleyCard.setPin(newPin);
                            System.out.println("thanks for banking with us");
                            System.out.println("This is your new " + kingsleyCard.getPin());
                        }
                        case 6 -> {
                            System.out.println("Enter the deposit amount");
                            double deposit = sc.nextInt();
                            kingsleyCard.deposit(deposit);
                            System.out.println("Your current account balance is " + kingsleyCard.getBalance());
                        }



                        default -> {System.out.println("Not a valid option");}


                    }


                } while (displayOption != -1);
          //      counter++;
            }else System.out.println("Incorrect Pin");
        } //while (counter <3);

    }

}
