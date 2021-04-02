package Chapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ArrayKataTest {
    ArrayKata kata;
    @BeforeEach
    void beforeEach(){
        kata=new ArrayKata();
    }
    @AfterEach
    void afterEach(){
        kata=null;
    }
@Test
    void  ToFindTheSumOfAnArray(){
        int[] Kc=new int[]{87,89,67,87,88,90,78,98,65,66};
  assertEquals(815,kata.arraySum(Kc));
    }

@Test
    void ToCheckForAnArrayMultiplication(){
    int[]  arrays=new int[]{87,89,67,87,88,90};
        assertEquals(978574672,ArrayKata.multiplyNums(arrays));
}
@Test
    void methodShouldBeAbleToMultiplyingElements(){
        int[] arrays=new int [] {1,2,3,4,5};
    assertTrue(ArrayKata.multiplyArray(arrays)==8);
}
}


