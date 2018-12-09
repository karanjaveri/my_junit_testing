import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class QuickBeforeAftertest {

    @After
    public static void afternotation(){
        System.out.println("After test");
    }

    @Test
    public void test1(){
    System.out.println("Hello");
}
    @Test
    public void test2(){
        System.out.println("World");
    }


    @Before
    public static void setup(){
        System.out.println("before test");
    }

}