public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        this.first = f;
        this.rest = r;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    public int iterativeSize() {
        int k = 0;
        IntList p = this;
        while (p != null) {
            k += 1;
            p = p.rest;
        }
        return k;
    }

    public int get(int n) {
        if (n == 0) {
            return first;
        }
        return this.rest.get(n - 1);
    }

    public void print_element() {
        for (int k = 0; k < this.size(); k++) {
            System.out.println(this.get(k));
        }
    }
}
