package abel;

/**
 * Class that implements a simple Linked List.
 *
 * @param <T> Generic Object.
 */
public class LinkedList<T> implements List<T> {

    private int size;
    private Node<T> first;
    private Node<T> last;

    /**
     * Default Constructor.
     */
    public LinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    /**
     * Method to add the first item.
     *
     * @param node Node object.
     */
    private void addFirst(final Node node) {
        node.next = null;
        this.first = node;
        this.last = node;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(final T data) {
        Node<T> node = new Node<>(data);
        if (this.first == null) {
            addFirst(node);
        } else {
            Node current = this.last;
            this.last = node;
            current.next = node;
        }
        this.size++;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T get(int index) {
        int count = 0;
        Node current = first;
        if (current == null) {
            return null;
        }
        if (count < index) {
            while (count < index) {
                current = current.next;
                count++;
            }
        }

        return (T) current.data;
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
        return first == null && size == 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(int index) {
        int count = 0;
        Node current = first;
        if (!isEmpty() && index < size) {
            if (count == index) {
                this.first = this.first.next;
            }
            if (count < index) {
                while (count < index - 1) {
                    current = current.next;
                    count++;
                }
                current.next = current.next.next;
            }
            this.size--;
        }
    }

    /**
     * Static class that represent the nodes of a Linked List.
     *
     * @param <T> Generic Object.
     */
    static class Node<T> {
        private T data;
        private Node next;

        /**
         * Default Constructor.
         *
         * @param data Generic object.
         */
        Node(final T data) {
            this.data = data;
            this.next = null;
        }
    }
}
