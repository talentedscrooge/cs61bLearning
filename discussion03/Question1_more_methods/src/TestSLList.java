public class TestSLList {
    public static void testAddlast() {
        SLList a = new SLList(1);
        a.addLast(2);
        SLList expected = new SLList(2);
        expected.addFirst(1);

        org.junit.Assert.assertEquals(a, expected);

    }

    public static void main(String[] args) {
        testAddlast();
    }
}
