import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingAppTest {

    @Test
    void checkDepositingAmount() {
        BankingApp myBankApp = new BankingApp();
        assertEquals(2000, myBankApp.depositCash(2000));
    }

    @Test
    void checkThatAccountCanDepositZeroAmount() {
        BankingApp myBankApp = new BankingApp();
        assertEquals(0, myBankApp.depositCash(0));
    }

    @Test
    void checkThatMyBankAppCannotDepositMinusValue() {
        BankingApp myBankApp = new BankingApp();
        assertEquals(2000, myBankApp.depositCash(2000));

    }

    @Test
    void checkThatTheAccountCanGetBalance() {
        BankingApp myBank = new BankingApp();
        assertEquals(0, myBank.getBalance());
    }

    @Test
    void checkThatTheAccountIsAbleToReceiveMoney() {
        BankingApp myBank = new BankingApp();
        myBank.depositCash(1000);
       assertEquals(800, myBank.withdrawCash(200));
        assertEquals(0,myBank.withdrawCash(-1));
    }
    @Test
    void checkThatAccountCanBuyAirtime() {
        BankingApp myBank = new BankingApp();
        myBank.depositCash(1000);
        assertEquals(800, myBank.buyAirtime(200));
    }
@Test
    void checkThatAccountCanTransfer(){
        BankingApp myBank=new BankingApp();
        myBank.depositCash(1000);
        assertEquals(990,myBank.transferMoney(10));
}
@Test
    void checkThatAccountCannotTransferNegativeValues(){
        BankingApp myBank = new BankingApp();
        myBank.depositCash(1000);
        assertEquals(900,myBank.transferMoney(100));
}
}