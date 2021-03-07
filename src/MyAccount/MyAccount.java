package MyAccount;

public class MyAccount {

    private double balance;
    private int pin;


    public void depositMoney(double deposit) {
        if (deposit > 0)
            balance += deposit;
    }
    public double getDepositMoney() {
        if (balance >= 0){
            return this.balance;
    }
return 0;
    }

    public double withdrawAmount(double withdrawal) {
if(this.pin==pin && balance>withdrawal && withdrawal>0){
       return balance-=withdrawal;
    }
return 0;

}

    public int setPin(int pin) {
       this.pin=pin;
        return this.pin;
    }

}