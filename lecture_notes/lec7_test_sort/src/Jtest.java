public class Jtest {
    public static void testSort() {
        String[] input = {"beware", "of", "falling", "rocks"};
        String[] expected = {"beware", "falling", "of", "rocks"};

        Sort.sort(input);

        org.junit.Assert.assertArrayEquals(expected, input);

    }

    public static void testFindSmallest() {
        String[] input = {"beware", "of", "falling", "rocks"};
        int expected = 0;
        int result = Sort.findSmallest(input, 0);

        org.junit.Assert.assertEquals(expected, result);

        String[] input2 = {"have", "i", "an", "egg"};
        int expected2 = 2;
        int result2 = Sort.findSmallest(input2,0);

        org.junit.Assert.assertEquals(expected2, result2);
    }

    public static void testSwap() {
        String[] input = {"have", "an", "egg"};
        String[] expected = {"an", "have", "egg"};

        Sort.swap(input, 0, Sort.findSmallest(input,0));
        org.junit.Assert.assertEquals(expected, input);
    }
    public static void main(String[] args) {
        testSort();
        //testFindSmallest();
        //testSwap();
    }
}
