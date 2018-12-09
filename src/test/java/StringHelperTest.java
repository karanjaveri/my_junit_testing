import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

StringHelper helper=new StringHelper();


    @Test
    public void test(){
    assertEquals("ABC","ABC");
}
@Test
    public void  test_Ainfirsttwoposition(){
    String str1=helper.truncateAInFirst2Positions("AACD");
    String expected= "CD";
    assertEquals(expected,str1);
}
    @Test
    public void  testAinfirstposition(){
        String str1=helper.truncateAInFirst2Positions("ACD");
        String expected= "CD";
        assertEquals(expected,str1);
    }

    @Test
    public void  testAnotinfirstposition(){
        String str1=helper.truncateAInFirst2Positions("CDA");
        String expected= "CDA";
        assertEquals(expected,str1);
    }
    @Test
    public void  testfirst2charactersaresame(){
        Boolean str1=helper.areFirstAndLastTwoCharactersTheSame("ro");
        assertEquals(true,str1);

    }
    @Test
    public void  testfirst2charactersarenotsame(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("abc"));

    }
    @Test
    public void  testfirst2charactersaresameusinfasserttrue(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("roro"));
    }
    @Test
    public void  testfirst2charactersaresameusinfassertfalse(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("bookbo"));
    }


}