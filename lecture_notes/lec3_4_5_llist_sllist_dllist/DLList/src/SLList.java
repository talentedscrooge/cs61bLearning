public class SLList<LochNess> {
    public class StuffNode {
        public LochNess item;
        public StuffNode next;

        public StuffNode(LochNess i, StuffNode n) {
            item = i;
            next = n;
        }
    }

    private StuffNode first;
    private int size;

//    public SLList() {
//        sentinel = new StuffNode(63, null);
//        size = 0;
//    }

    public SLList(LochNess x) {
        first = new StuffNode(x, null);
        size = 1;
    }

    public void addFirst(LochNess x) {
        size += 1;
        first = new StuffNode(x, first);
    }

    public LochNess getFirst() {
        return first.item;
    }

    public int size() {
        return size;
    }

    public void addLast(LochNess x) {
        size += 1;
        StuffNode m = first;

        while (m.next != null) {
            m = m.next;
        }
        m.next = new StuffNode(x, null);
    }
}
