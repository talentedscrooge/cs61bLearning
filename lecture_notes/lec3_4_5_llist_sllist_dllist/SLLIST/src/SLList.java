public class SLList {
    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    private int size;

    public SLList() {
        sentinel = new IntNode(63, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public SLList(int[] x) {
        sentinel = new IntNode(63, null);
        for (int i = x.length - 1; i >= 0; i--) {
            this.addFirst(x[i]);
        }
    }

    public void addFirst(int x) {
        size += 1;
        sentinel.next = new IntNode(x, sentinel.next);
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public int size_iterative() {
        IntNode p = sentinel;
        int count = 1;
        while (p.next != null) {
            count += 1;
            p = p.next;
        }
        return count;
    }

    //    private static int size(IntNode p) {
//        if (p.next == null) {
//            return 1;
//        }
//        return 1 + size(p.next);
//    }
//
//    public int size() {
//        return size(first);
//    }
    public int size() {
        return size;
    }

    public void addLast(int x) {
        size += 1;
        IntNode m = sentinel;
        /*for version*/
//        for (int k = 1; k < this.size(); k++) {
//            m = m.next;
//        }
        /*while version*/
        while (m.next != null) {
            m = m.next;
        }
        m.next = new IntNode(x, null);
    }

    public void deleteFirst() {
        if (sentinel.next != null) {
            sentinel.next = sentinel.next.next;
            size -= 1;
        }

    }


    public static void main(String[] args) {
        SLList k = new SLList();
        k.addFirst(10);
        k.addFirst(11);

        //System.out.println(k.getFirst());
        System.out.println(k.size());
        k.addLast(8);
        System.out.println(k.size());
    }
}
