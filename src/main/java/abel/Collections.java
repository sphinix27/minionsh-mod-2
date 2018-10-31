package abel;

/**
 * Class that performs some operations with Lists.
 */
public final class Collections {

    /**
     * Default Constructor.
     */
    private Collections() {
    }

    /**
     * Sort the given list.
     *
     * @param list List to sort.
     * @param <T> Generic Object.
     * @return List.
     */
    public static <T> List<T> sort(final List<T> list) {
        return null;
    }

    /**
     * Find the position of the item.
     *
     * @param sortedList List to search.
     * @param item       Generic Object.
     * @param <T> Generic Object.
     * @return int.
     */
    public static <T> int binarySearch(final List<T> sortedList, final T item) {
        int low = 0;
        int high = sortedList.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Comparable guess = (Comparable) sortedList.get(mid);
            if (guess.compareTo(item) == 0) {
                return mid;
            }
            if (guess.compareTo(item) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
