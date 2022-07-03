public class max_own {
    /**
     * Returns the maximum value from m.
     */
    public static int max(int[] m) {
        int larger = 0;
        int index = 0;
        while (index < m.length) {
            if (m[index] > larger) {
                larger = m[index];
            }
            index += 1;
        }
        return larger;
    }


    public static int max_forversion(int[] m) {
        int larger = 0;

        for (int index = 0; index < m.length; index++) {
            if (m[index] > larger) {
                larger = m[index];
            }
        }
        return larger;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        int max_num = max(numbers);
        System.out.println(max_num);
        int max_num_for = max_forversion(numbers);
        System.out.println(max_num_for);
    }
}
