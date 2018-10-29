package abel;

/**
 * Abstract Class that implements a List.
 *
 * @param <T> Generic Object.
 */
public abstract class AbstractList<T> implements List<T> {

    protected int size;

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
    public abstract void add(T data);

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract T get(int index);

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract void remove(int index);
}
