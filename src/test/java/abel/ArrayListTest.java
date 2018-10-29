package abel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Class to test Linked List methods.
 */
public class ArrayListTest {

    private List arrayList;

    /**
     *
     */
    @Before
    public void setUp() {
        arrayList = new ArrayList<Integer>();
    }

    /**
     *
     */
    @Test
    public void testArrayListIsEmptyAtInitialize() {
        assertTrue(arrayList.isEmpty());
    }

    /**
     *
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayListReturnsNullIfItsEmpty() {
        arrayList.get(0);
    }

    /**
     *
     */
    @Test
    public void testArrayListAddFirstItem() {
        arrayList.add(1);
        final int expected = 1;
        assertEquals(expected, arrayList.get(0));
    }

    /**
     *
     */
    @Test
    public void testArrayListGetNthItem() {
        final int limit = 20;
        for (int i = 1; i <= limit; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < limit; i++) {
            assertEquals(i + 1, arrayList.get(i));
        }
    }

    /**
     *
     */
    @Test
    public void testArrayListRemoveFirstItem() {
        final int expected = 2;
        final int limit = 10;
        for (int i = 1; i <= limit; i++) {
            arrayList.add(i);
        }
        arrayList.remove(0);
        assertEquals(expected, arrayList.get(0));
    }

    /**
     *
     */
    @Test
    public void testArrayListRemoveItemAtPosition() {
        final int expected = 6;
        final int limit = 10;
        final int index = 4;
        for (int i = 1; i <= limit; i++) {
            arrayList.add(i);
        }
        arrayList.remove(index);
        assertEquals(expected, arrayList.get(index));
    }

    /**
     *
     */
    @Test
    public void testArrayListRemoveAtBadPosition() {
        final int expected = 10;
        final int limit = 10;
        final int index = 9;
        for (int i = 1; i <= limit; i++) {
            arrayList.add(i);
        }
        arrayList.remove(limit);
        assertEquals(expected, arrayList.get(index));
    }

    /**
     *
     */
    @Test
    public void testArrayListCurrentSize() {
        final int expected = 1;
        arrayList.add(1);
        int actual = arrayList.size();
        assertEquals(expected, actual);
    }
}
