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
        profit.sumOfSimPleInterest(1000,0.05);
        assertEquals(1628.894626777442,profit.getSumOfSimpleInterest());
}


}
