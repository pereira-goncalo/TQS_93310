/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euromillions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import sets.SetOfNaturals;

import java.util.NoSuchElementException;

/**
 * @author ico0
 */
public class DipTest {

    private Dip instance;
    private Object IllegalArgumentException;


    public DipTest() {
    }

    @BeforeEach
    public void setUp() {
        instance = new Dip(new int[]{10, 20, 30, 40, 50}, new int[]{1, 2});
    }

    @AfterEach
    public void tearDown() {
        instance = null;
    }


    @Test
    public void testConstructorFromBadArrays() {
        int[] rightNums = new int[]{ 1,2,3,4,5 };
        int[] rightStars = new int[]{ 1,2 };
        int[] moreNums = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int[] lessNums = new int[]{ 1,2,3,4 };
        int[] moreStars = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int[] lessStars = new int[]{ 1 };

        Exception exception = (Exception)Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Dip moreN = new Dip(moreNums, rightStars);
        });

        Exception exception2 = (Exception)Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Dip lessN = new Dip(lessNums, rightStars);
        });

        Exception exception3 = (Exception)Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Dip moreS = new Dip(rightNums, moreStars);
        });

        Exception exception4 = (Exception)Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Dip lessS = new Dip(rightNums, lessStars);
        });

        // todo: instantiate a dip passing valid or invalid arrays
        // fail("constructor from bad arrays: test not implemented yet");
    }

    @Test
    public void testFormat() {
        // note: correct the implementation of the format(), not the test...
        String result = instance.format();
        assertEquals("N[ 10 20 30 40 50] S[  1  2]", result, "format as string: formatted string not as expected. ");
    }

}
