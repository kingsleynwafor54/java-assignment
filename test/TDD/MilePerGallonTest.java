package TDD;
import  java.util.Scanner;
import MyAccount.MilePerGallon;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MilePerGallonTest {

    @Test
    void gasUsePerMile() {
        MilePerGallon miley = new MilePerGallon();

        assertEquals(1, miley.milePerGallons(1, 1));
    }

    @Test
    void gasUseMilePerGallon() {
        MilePerGallon miley = new MilePerGallon();
        double gasUsage = miley.milePerGallons(1.0, 1.0);
        assertEquals(1, gasUsage);
    }

    @Test
    void gasUseMilesPerGallons() {
        MilePerGallon miley = new MilePerGallon();
        double gasUsage = miley.milePerGallons(3, 2);
        assertEquals(1.5, gasUsage);
    }

    @Test
    void gasUseMilePerGallonsUsingMultipleNumber() {
        MilePerGallon miley = new MilePerGallon();

        double gasUsage = miley.milePerGallons(3, 3);
        assertEquals(1, gasUsage);
        assertEquals((0.75),miley.milePerGallons(3,4));

    }
@Test
    void checkThatTheSetAndGetMethodAreWorkingVeryWell(){
    MilePerGallon miley = new MilePerGallon();
   // Scanner sc =new Scanner(System.in);

    miley.setMiles(4);

    miley.setGallons(5);
    assertEquals(0.8,miley.milePerGallons(miley.getMiles(), miley.getGallons()));

}


@Test
    void CheckThatAMinusValueCannotBeInputted(){
        MilePerGallon jc =new MilePerGallon();
        assertEquals(0,jc.milePerGallons(-1,-1));
}

@Test
    void UsingSentinelLoopToGetTheMilesPerGallons(){
        MilePerGallon jc =new MilePerGallon();
        assertEquals(5,jc.milePerGallons(100,20));
        assertEquals(7,jc.milePerGallons(70,10));
}
}

