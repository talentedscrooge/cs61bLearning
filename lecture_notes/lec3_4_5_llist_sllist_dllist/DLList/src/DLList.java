public class DLList<LochNess> {
    public class StuffNode {
        public LochNess item;
        public StuffNode next;
        public StuffNode prev;

        public StuffNode(StuffNode previous, LochNess i, StuffNode n) {
            prev = previous;
            item = i;
            next = n;
        }
    }

    private StuffNode sentinel;
    private StuffNode last;
    private int size;

    //    public DLList() {
//        sentinel = new StuffNode(63, null);
//        size = 0;
//    }
    public DLList() {
        sentinel = new StuffNode(null, null, null);
        last = sentinel;

        size = 0;
    }

    public DLList(LochNess x) {
        sentinel = new StuffNode(null, null, null);
        sentinel.next = new StuffNode(sentinel, x, sentinel);
        sentinel.prev = sentinel.next;
        last = sentinel.next;
        size = 1;
    }

    public void addFirst(LochNess x) {
        size += 1;
        sentinel.next = new StuffNode(sentinel, x, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
    }

    public LochNess getFirst() {
        return sentinel.next.item;
    }

    public int size() {
        return size;
    }

    public void addLast(LochNess x) {
        last.next = new StuffNode(last, x, sentinel);
        last = last.next;
        sentinel.prev = last;
    }

    public void removeLast() {
        last = last.prev;
        last.next = sentinel;
        sentinel.prev = last;
    }

    public static void main(String[] args) {
        DLList<String> k = new DLList<>("HELLO");
        k.addFirst("You");
    }
}
