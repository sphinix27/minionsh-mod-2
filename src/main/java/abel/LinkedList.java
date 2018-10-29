package abel;

/**
 * Class that implements a simple Linked List.
 *
 * @param <T> Generic Object.
 */
public class LinkedList<T> extends AbstractList<T> {

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
            Node<T> current = this.last;
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
        Node<T> current = first;
        if (current == null) {
            throw new IndexOutOfBoundsException();
        }
        if (count < index) {
            while (count < index) {
                current = current.next;
                count++;
            }
        }

        return current.data;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(int index) {
        int count = 0;
        Node<T> current = first;
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
        private Node<T> next;

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
