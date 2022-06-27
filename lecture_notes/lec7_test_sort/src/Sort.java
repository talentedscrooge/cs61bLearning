public class Sort {
    /*find the smallest item
    *Move it to the front
    * Selection sort the remaining N-1 element(recursion) */
    public static void sort(String[] input) {
        sort(input, 0);
    }

    private static void sort(String[] x, int start) {
        int smallestIndex = findSmallest(x, start);
        swap(x, start, smallestIndex);
        if (start < x.length - 2) {
            sort(x, start + 1);
        }
    }
    public static int findSmallest(String[] x, int k) {
        int smallestIndex = k;
        for(int i = k; i < x.length; i++) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(String[] x, int start, int index) {
        String temp = x[start];
        x[start] = x[index];
        x[index] = temp;
    }
}
