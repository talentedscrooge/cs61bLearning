public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }


    public void addAdjacent() {
        IntList p = this;
        while (p != null) {
            if (p.first == p.rest.first) {
                p.first = p.first + p.rest.first;
                p.rest = p.rest.rest;
            }
            p = p.rest;
        }
    }

    public static void main(String[] args) {
        IntList l = new IntList(1, null);
        l = new IntList(1, l);
        l = new IntList(2, l);
        l = new IntList(3, l);
        l.addAdjacent();
        l.addAdjacent();
    }
}
