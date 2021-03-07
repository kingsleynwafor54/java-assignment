package TDD;

import Kata.Kata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @BeforeEach
   public void startWithThis(){

    }
    @Test
    void purchaseOneUnitOfTestDrillerTest(){

        Kata kata=new Kata ();

        assertEquals(1500,kata.calculatePrice(1));
    }

    @Test
    void purchaseFromOneToFour(){
        Kata kata=new Kata ();
        assertEquals(1400*5,kata.calculatePrice(5));
        assertEquals(1400*6,kata.calculatePrice(6));
    }

@Test
    void purchaseFiveToNine(){
    Kata kata=new Kata ();
    assertEquals(1400*9,kata.calculatePrice(9));

}
@Test
    void purchaseFromTenToTwentyNine(){
        Kata kata =new Kata();
    assertEquals(1100*29,kata.calculatePrice(29));
}
@Test
    void purchaseFromThirdToFortyNine(){
        Kata kata =new Kata();
    assertEquals(1100*49,kata.calculatePrice(49));
}
@Test
    void purchaseFromFiveToNinety(){
        Kata kata = new Kata();
    assertEquals(1100*29,kata.calculatePrice(29));
}
@Test
    void purchaseFromFromHundredToHundredAndNinetyNine(){
        Kata kata =new Kata();
    assertEquals(900*100,kata.calculatePrice(100));
}

@Test
    void purchaseTwoHundred(){
        Kata kata =new Kata();
    assertEquals(800*200,kata.calculatePrice(200));
}
}
