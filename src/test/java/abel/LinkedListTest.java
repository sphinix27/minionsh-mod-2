package abel;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Class to test Linked List methods.
 */
public class LinkedListTest {

    private List linkedList;

    /**
     *
     */
    @Before
    public void setUp() {
        linkedList = new LinkedList<Integer>();
    }

    /**
     *
     */
    @Test
    public void testLinkedListIsEmptyAtInitialize() {
        assertTrue(linkedList.isEmpty());
    }

    /**
     *
     */
    @Test
    public void testLinkedListReturnsNullIfItsEmpty() {
        assertNull(linkedList.get(0));
    }

    /**
     *
     */
    @Test
    public void testLinkedListAddFirstItem() {
        linkedList.add(1);
        final int expected = 1;
        assertEquals(expected, linkedList.get(0));
    }

    /**
     *
     */
    @Test
    public void testLinkedListGetNthItem() {
        final int limit = 10;
        for (int i = 1; i <= limit; i++) {
            linkedList.add(i);
        }
        for (int i = 0; i < limit; i++) {
            assertEquals(i + 1, linkedList.get(i));
        }
    }

    /**
     *
     */
    @Test
    public void testLinkedListRemoveFirstItem() {
        final int expected = 2;
        final int limit = 10;
        for (int i = 1; i <= limit; i++) {
            linkedList.add(i);
        }
        linkedList.remove(0);
        assertEquals(expected, linkedList.get(0));
    }

    /**
     *
     */
    @Test
    public void testLinkedListRemoveItemAtPosition() {
        final int expected = 6;
        final int limit = 10;
        final int index = 4;
        for (int i = 1; i <= limit; i++) {
            linkedList.add(i);
        }
        linkedList.remove(index);
        assertEquals(expected, linkedList.get(index));
    }

    /**
     *
     */
    @Test
    public void testLinkedListRemoveAtBadPosition() {
        final int expected = 10;
        final int limit = 10;
        final int index = 9;
        for (int i = 1; i <= limit; i++) {
            linkedList.add(i);
        }
        linkedList.remove(limit);
        assertEquals(expected, linkedList.get(index));
    }

    /**
     *
     */
    @Test
    public void testLinkedListCurrentSize() {
        final int expected = 1;
        linkedList.add(1);
        int actual = linkedList.size();
        assertEquals(expected, actual);
    }
}
