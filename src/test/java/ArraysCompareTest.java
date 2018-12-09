import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ArraysCompareTest {
    @Test
    public void testtosortarray() {
        int[] ab = {99, 2, 5, 4, 3, 1};
        int[] expected = {1, 2, 3, 4, 5, 99};
        Arrays.sort(ab);
        assertArrayEquals(expected, ab);
    }

    @Test
    public void testusingnullpointerexception1() {
        int[] ab = null;
        try {
            Arrays.sort(ab);
        } catch (NullPointerException e) {
            //success
        }

    }

    //in the below test a timer of 1 sec is kept. if execution takes more than 1 sec to execute then it throe=ws an error.
    @org.junit.Test(timeout=1000)
    public void testusingtimer(){

        int[] ab= {32,1,54};
        for(int i=1;i<=100000000;i++){
            ab[0]=i;
            Arrays.sort(ab);
        }

    }
}