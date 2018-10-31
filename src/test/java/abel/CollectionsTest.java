package abel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test Collections.
 */
public class CollectionsTest {

    private List arrayList;
    private List linkedList;

    /**
     *
     */
    @Before
    public void setUp() {
        arrayList = new ArrayList<Integer>();
        linkedList = new LinkedList<String>();
    }

    /**
     *
     */
    @Test
    public void testCollectionsBinarySearchWithIntegers() {
        final int limit = 5;
        for (int i = 0; i < limit; i++) {
            arrayList.add(i);
        }
        int expected = 2;
        int actual = Collections.binarySearch(arrayList, 2);
        assertEquals(expected, actual);
    }

    /**
     *
     */
    @Test
    public void testCollectionsBinarySearchWithStrings() {
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        int expected = 2;
        int actual = Collections.binarySearch(linkedList, "c");
        assertEquals(expected, actual);
    }

    /**
     *
     */
    @Test
    public void testCollectionsBinarySearchItemNotFound() {
        final int limit = 5;
        final int seven = 7;
        for (int i = 0; i < limit; i++) {
            arrayList.add(i);
        }
        int expected = -1;
        int actual = Collections.binarySearch(arrayList, seven);
        assertEquals(expected, actual);
    }
}
