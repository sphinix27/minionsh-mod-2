package abel;

import java.util.Arrays;

/**
 * Class that implements a simple Array List.
 *
 * @param <T> Generic Object.
 */
public class ArrayList<T> extends AbstractList<T> {

    public static final double GROW_RATE = 1.5;
    private static final int INITIAL_SIZE = 10;
    private T[] array;

    /**
     * Default Constructor.
     */
    public ArrayList() {
        array = (T[]) new Object[0];
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(final T data) {
        if (isEmpty()) {
            array = (T[]) new Object[INITIAL_SIZE];
        }
        if (isMaxSize()) {
            int newArrayLength = (int) (size + size * GROW_RATE);
            array = Arrays.copyOf(array, newArrayLength);
        }
        array[size++] = data;
    }

    /**
     * Method that checks if the size of the array is at limit.
     *
     * @return boolean.
     */
    private boolean isMaxSize() {
        return size == array.length;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T get(int index) {
        return array[index];
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
