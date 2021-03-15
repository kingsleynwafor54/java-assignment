public class BankingApp {
    private double balance;

    public void balance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public double depositCash(double amount) {
        if (amount > 0) {
            return this.balance += amount;
        }
        return 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double withdrawCash(double amount) {
        if (amount <= balance && amount>0) {
            return balance -= amount;

        }
        return 0;
    }

    public double buyAirtime(int airtime) {
        if (balance >=airtime && airtime >0){
          return   balance-=airtime;
        }
return  0;
    }

    public double transferMoney(int money) {
        if (balance >=money && money>0){
        return     balance-=money;
        }
    return 0;
    }
}