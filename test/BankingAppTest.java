import Chapter5.BankingApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingAppTest {

    @Test
    void checkDepositingAmount() {
        BankingApp myBankApp = new BankingApp();
        myBankApp.setPin("1234");
        assertEquals(2000, myBankApp.depositCash(2000));
    }

    @Test
    void checkThatAccountCanDepositZeroAmount() {
        BankingApp myBankApp = new BankingApp();
        myBankApp.setPin("1234");
        assertEquals(0, myBankApp.depositCash(0.00));
    }

    @Test
    void checkThatMyBankAppCannotDepositMinusValue() {
        BankingApp myBankApp = new BankingApp();
        myBankApp.setPin("1234");
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
        myBank.setPin("1234");
       assertEquals(800, myBank.withdrawCash(200,"1234"));
        assertEquals(0,myBank.withdrawCash(-1,"1234"));
    }
    @Test
    void checkThatAccountCanBuyAirtime() {
        BankingApp myBank = new BankingApp();
        myBank.depositCash(1000);
        myBank.setPin("1234");
        assertEquals(800, myBank.buyAirtime(200,"1234"));
    }
@Test
    void checkThatAccountCanTransfer(){
        BankingApp myBank=new BankingApp();
        myBank.depositCash(1000);
    myBank.setPin("1234");
        assertEquals(990,myBank.transferMoney(10,"1234"));
}
@Test
    void checkThatAccountCannotTransferNegativeValues(){
        BankingApp myBank = new BankingApp();
        myBank.depositCash(1000);
    myBank.setPin("1234");
        assertEquals(900,myBank.transferMoney(100,"1234"));
}

@Test
 void checkForPin(){
        BankingApp myBank=new BankingApp();
        myBank.setPin("123");
        myBank.depositCash(1000);
        assertEquals(900, myBank.withdrawCash(100,"123"));

}
}