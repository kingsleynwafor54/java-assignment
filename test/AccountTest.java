import BusinessCalculation.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test

    public void accountCanBeDepositedIntoAccount() {
        MyAccount king = new MyAccount();


        king.depositMoney(2500.00);
        double kingBalance = king.getDepositMoney();
        assertEquals(2500, kingBalance);
    }

    @Test
    void accountToDepositZeroCash() {
        MyAccount king = new MyAccount();
        king.depositMoney(0);
        assertEquals(0, king.getDepositMoney());
    }
    @Test
    void accountToDepositMinusCash() {
        MyAccount king = new MyAccount();
        king.depositMoney(-1);
        assertEquals(0, king.getDepositMoney());
    }
@Test
    void accountToWithdrawAmount(){
        MyAccount king =new MyAccount();
       double kingWithdrawal= king.withdrawAmount(10);
        assertEquals(0,kingWithdrawal);
}

@Test
    void accountToSetPin(){
        MyAccount king = new MyAccount();
        int kingSetPin=king.setPin(1234);
        assertEquals(1234,kingSetPin);
}


}

