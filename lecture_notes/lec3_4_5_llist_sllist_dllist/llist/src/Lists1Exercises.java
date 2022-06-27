public class Lists1Exercises {
    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change.
     */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
//        IntList result = new IntList(L.get(L.size() - 1) + x, null);
//        for (int k = L.size() - 2; k >= 0; k--) {
//            result = new IntList(L.get(k) + x, result);
//        }
//        return result;
        if (L.rest == null) {

            return new IntList(L.first + x, null);
        }
        return new IntList(L.first + x, incrList(L.rest, x));
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword.
     */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        L.first -= x;
        if (L.rest == null) {
            
            return null;
        }
        return dincrList(L.rest, x);
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        //System.out.println(L.size());
        //System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        //System.out.println(L.get(1));
        IntList m = incrList(L, 3);
        m.print_element();
        dincrList(L, 3);
        L.print_element();
        //newL.print_element();
    }
}
