import com.tiy.practice.LuckyArray;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by crci1 on 12/30/2016.
 */
public class LuckyArrayTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testNumbersInArrays(){
        LuckyArray luckyArray = new LuckyArray();
        int[] checkValues = {2, 0, 7, 1};
        boolean isLucky = luckyArray.getLuck(checkValues);
        assertEquals(false, isLucky);
    }

}