package Chapter4;

import Chapter3.TddClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LearningTDD {
    TddClass king;
    @BeforeEach
    void beforeEach(){
        king=new TddClass("kingsley","Nwafor","kingsley54@gmail.com","scv");
    }
    @Test
    void methodShouldBeAbleToSetAndGetWithSCV()
    {
     king.setScvId("6021");
     assertEquals("SCV6021",king.getScvId());
    }
@Test
    void methodShouldBeAbleToSetAndGetEmail(){
        king.setEmail("kingsley54@gmail.com");
        assertEquals("kingsley54@gmail.com",king.getEmail());
}

@Test
    void checkTheConstructors(){
    TddClass king=new TddClass("kingsley","Nwafor","kingsley54@gmail.com","scv");
    assertNotNull(king.getEmail());
    assertNotNull(king.getFirstName());
    assertNotNull(king.getLastName());
    assertNotNull(king.getScvId());
}
}
