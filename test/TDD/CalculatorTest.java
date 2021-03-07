package TDD;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
@BeforeEach
void startAllTest(){
    calculator=new Calculator();
}

    @Test
    void addTwoNumberTest(){

    assertEquals(4,calculator.add(2,2));
        assertEquals(7,calculator.add(5,2));
}
@Test
    void MultiplyingNumber(){
       ;
        assertEquals(4,calculator.multiply(2,2));
    assertEquals(10,calculator.multiply(5,2));
}
@Test
@DisplayName("Division by zero returns zero")
    void divideTwoNumbersTest(){

        assertEquals(2,calculator.divide(6,3));
}
    @Test
    @DisplayName("Division by float returns float")
    void divideTwoNumber(){

        assertEquals(2.5,calculator.divide(10,4));
    }
    @Test
    @DisplayName("Division by zero returns zero")
    void divideZeroDenominator(){

        assertEquals(0,calculator.divide(10,0));
    }
     @Test
    @DisplayName("Difference test")
        void differenceTest(){
            assertEquals(6,calculator.difference(10,4));
         }
         @Test
    void differenceTestToProduceAbsoluteResult(){
        assertEquals(6,calculator.difference(10,4));
    }
     }
