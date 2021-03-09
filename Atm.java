public class Atm {
    private double balance;
    private int pin;

    public Atm(double balance, int pin) {
        this.pin = pin;
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public void deposit(double deposit) {
        if (deposit > 0) {
            this.balance += deposit;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdrawal(double withdraw) {

        if (withdraw > 0 && withdraw <=balance ) {
            this.balance -= withdraw;
        }

    }

    public void transferMoney(double transfer) {
        if (balance > transfer && transfer<=balance) {
            this.balance -= transfer;
        }

    }

    public void setPin(int nPin) {


            this.pin = nPin;

        }


    public int getPin() {

        return this.pin;
    }

    public int buyAirtime(int airtime) {
        if (airtime > 0) {
            this.balance -= balance;
        }
        return 0;
    }



}

