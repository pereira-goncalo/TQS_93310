/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.*;

/**
 * @author ico0
 */
public class SetOfNaturalsTest {
    private SetOfNaturals setA;
    private SetOfNaturals setB;
    private SetOfNaturals setC;
    private SetOfNaturals setD;

    @BeforeEach
    public void setUp() {
        setA = new SetOfNaturals();
        setB = SetOfNaturals.fromArray(new int[]{10, 20, 30, 40, 50, 60});

        setC = new SetOfNaturals();
        for (int i = 5; i < 50; i++) {
            setC.add(i * 10);
        }
        setD = SetOfNaturals.fromArray(new int[]{30, 40, 50, 60, 10, 20});
    }

    @AfterEach
    public void tearDown() {
        setA = setB = setC = setD = null;
    }

    @Test
    @DisplayName("Teste AddElement.")
    public void testAddElement() {

        setA.add(99);
        assertTrue(setA.contains(99), "add: added element not found in set.");
        assertEquals(1, setA.size());

        setB.add(11);
        assertTrue(setB.contains(11), "add: added element not found in set.");
        assertEquals(7, setB.size(), "add: elements count not as expected.");
    }

    @Test
    @DisplayName("Teste AddBadArray")
    public void testAddBadArray() {
        int[] elems = new int[]{10, 20, -30};

        // must fail with exception
        assertThrows(IllegalArgumentException.class, () -> setA.add(elems));
    }


    @Test
    @DisplayName("Teste IntersectForNoIntersection.")
    public void testIntersectForNoIntersection() {
        assertFalse(setA.intersects(setB), "no intersection but was reported as existing");
        assertTrue(setB.intersects(setD));
    }

    @Test
    @DisplayName("Teste Size")
    public void testSize() {
        assertEquals(0, setA.size());
        assertEquals(6, setB.size());
    }

    @Test
    @DisplayName("Teste Equals")
    public void testEquals() {
        assertTrue(setB.equals(setB));
        assertFalse(setB.equals(1));
        assertFalse(setB.equals(null));
    }

    @Test
    @DisplayName("Teste Contains")
    public void testContains() {
        assertTrue(setB.contains(10));
        assertFalse(setB.contains(1));
    }

    @Test
    @DisplayName("Teste Hash")
    public void testHash() {
        assertEquals(setA.hashCode(), setA.hashCode());
        assertNotEquals(setA.hashCode(), setB.hashCode());
    }

    @Test
    @DisplayName("Teste Iterator")
    public void testIterator() {
        Iterator<Integer> iterator = setA.iterator();
        assertFalse(iterator.hasNext());
        Exception exception = assertThrows(NoSuchElementException.class, () -> iterator.next());
    }

    @Test
    @DisplayName("Teste add")
    public void testAdd() {
        SetOfNaturals setT;
        setT = SetOfNaturals.fromArray(new int[]{10, 20, 30, 40, 50});
        setT.add(60);
        assertEquals(setT, setB);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> setT.add(60));

    }

}
