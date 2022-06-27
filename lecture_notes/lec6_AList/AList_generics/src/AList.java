public class AList<Glorp> {
    /**
     * Creates an empty list.
     */
    public int size;
    public Glorp[] items;

    public AList() {
        size = 0;
        items = (Glorp[]) new Object[100];
    }

    /**
     * Inserts X into the back of the list.
     */
    public void addLast(Glorp x) {
        size += 1;
        if (size > items.length) {
            Glorp[] a = (Glorp[]) new Object[items.length * 2];
            System.arraycopy(items, 0, a, 0, size - 1);
            items = a;
        }
        items[size - 1] = x;
    }

    /**
     * Returns the item from the back of the list.
     */
    public Glorp getLast() {
        return items[size - 1];
    }

    /**
     * Gets the ith item in the list (0 is the front).
     */
    public Glorp get(int i) {
        return items[i];
    }

    /**
     * Returns the number of items in the list.
     */
    public int size() {
        return size;
    }

    /**
     * Deletes item from back of the list and
     * returns deleted item.
     */
    public Glorp removeLast() {
        Glorp x = getLast();
        items[size - 1] = null;
        size -= 1;
        return x;
    }
}
