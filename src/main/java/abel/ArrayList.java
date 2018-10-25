package abel;

import java.util.Arrays;

/**
 * Class that implements a simple Array List.
 *
 * @param <T> Generic Object.
 */
public class ArrayList<T> implements List {

    public static final double GROW_RATE = 1.5;
    private int size;
    private Object[] array;
    private static final int INITIAL_SIZE = 10;
    private static final Object[] INITIAL_ARRAY = new Object[0];
    private int currentArraySize;

    /**
     * Default Constructor.
     */
    public ArrayList() {
        array = INITIAL_ARRAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(final Object data) {
        if (isEmpty()) {
            array = new Object[INITIAL_SIZE];
            currentArraySize = INITIAL_SIZE;
        }
        if (isMaxSize()) {
            currentArraySize = (int) (size + size * GROW_RATE);
            array = Arrays.copyOf(array, currentArraySize);
        }
        array[size++] = data;
    }

    /**
     * Method that checks if the size of the array is at limit.
     * @return boolean.
     */
    private boolean isMaxSize() {
        return size == currentArraySize;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(int index) {
        return isEmpty() ? null : array[index];
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(int index) {
        for (int i = 0; i < size; i++) {
            if (i >= index) {
                array[i] = i == size - 1 ? null : array[i + 1];
            }
        }
        size--;
    }
}
