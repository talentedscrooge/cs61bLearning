public class SLList {
    private class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private IntNode first;
    private int size;

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
        size += 1;
    }

    public void addLast(int x) {
        size += 1;
        IntNode p = this.first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    public void insert(int x, int pos) {
        if (pos == 0) {
            addFirst(x);
        } else if (pos < size) {
            IntNode p = first;
            IntNode prev = null;
            while (pos != 0) {
                prev = p;
                p = p.next;
                pos -= 1;
            }
            p = new IntNode(x, p);
            prev.next = p;
        } else {
            addLast(x);
        }
    }

    public void reverse() {
        if (first == null || first.next == null) {
            return;
        }

        IntNode ptr = first.next;
        first.next = null;

        while (ptr != null) {
            IntNode temp = ptr.next;
            ptr.next = first;
            first = ptr;
            ptr = temp;
        }
    }

}



