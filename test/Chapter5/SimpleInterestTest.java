package Chapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleInterestTest {
    SimpleInterest profit;
    @BeforeEach
    void beforeEach(){
        profit=new SimpleInterest();
    }
@AfterEach
    void afterEach(){
        profit=null;
}
@Test
    void methodShouldBeAbleToIncrementForTwoYears(){
        profit.sumOfSimPleInterest(35000,0.06);
        assertEquals(4326.000000000007,profit.getSumOfSimpleInterest());
}


}
