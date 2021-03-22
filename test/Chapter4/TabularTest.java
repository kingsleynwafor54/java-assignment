package Chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabularTest {
    @Test
            void CheckIfTheMethodCanMultiplyHundred() {
        Tabular myTabular = new Tabular();
        myTabular.multiplyingNumbers(2);
        assertEquals(200, myTabular.getNumbersInHundred());
    }
@Test
    void checkIfMethodCanMultiplyInThousands(){
        Tabular myTabular=new Tabular();
        myTabular.multiplyingNumbers(3);
        assertEquals(3000,myTabular.getNumbersInThousands());
}

}