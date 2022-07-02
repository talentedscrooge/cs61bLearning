public class IntList_method {
    public static IntList square(IntList L) {
        if (L.rest == null) {
            return new IntList(L.first * L.first, null);
        }
        return new IntList(L.first * L.first, square(L.rest));
    }

    public static IntList squareDestructive(IntList L) {
        L.first = L.first * L.first;
        if (L.rest == null) {
            return null;
        }
        return squareDestructive(L.rest);
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L = new IntList(6, L);
        L = new IntList(7, L);
        IntList m = square(L);
        m.print_element();
        L.print_element();
        squareDestructive(L);
        L.print_element();
    }
}
