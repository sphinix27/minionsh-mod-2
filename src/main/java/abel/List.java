package abel;

/**
 * Interface to be implemented by Linked List and Array List.
 *
 * @param <T> Generic Object.
 */
public interface List<T> {

    /**
     * Method to get the actual size of the List.
     *
     * @return int.
     */
    int size();

    /**
     * Method to verify if the List is empty.
     *
     * @return boolean.
     */
    boolean isEmpty();

    /**
     * Method to add new items to the List.
     *
     * @param data Generic Object.
     */
    void add(T data);

    /**
     * Method to get List items given an index.
     *
     * @param index int.
     * @return casted Object.
     */
    T get(int index);

    /**
     * Method to remove List items given an index.
     *
     * @param index int.
     */
    void remove(int index);

    /**
     * Convert the List to an Array.
     * @return Array of Objects.
     */
    Object[] toArray();
}
