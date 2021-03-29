package Chapter4;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class TabularOutputTest {

    @Test
    void checkThatTheMachineCanOutPut(){
        TabularOutput sc=new TabularOutput();
       TabularOutput.tabularOutPut(1000);
//assertTrue(TabularOutput.tabularOutPut(7)==7000);
    }
}
