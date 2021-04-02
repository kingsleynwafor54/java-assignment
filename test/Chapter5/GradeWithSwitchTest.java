package Chapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeWithSwitchTest {
    GradeWithSwitch gradeWithSwitch;
    @BeforeEach
    void beforeEach(){
        gradeWithSwitch=new GradeWithSwitch() ;
    }
@AfterEach
    void AfterEach(){
        gradeWithSwitch =null;
}
@Test
    void GradeWithSwitchShouldBeAbleTOTakeInAndCalculateGrade(){
       gradeWithSwitch.calculateTotalGrade(60);
        assertEquals(60, gradeWithSwitch.getCalculatedGrade());
}

@Test
    void GradeWithSwitchCanGetAverage(){
        gradeWithSwitch.calculateTotalGrade(95);
        assertEquals(9,gradeWithSwitch.getAverageGrade());
}
}
