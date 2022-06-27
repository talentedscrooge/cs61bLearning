public class Intlist_launcher {
    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L = new IntList(6, L);
        L = new IntList(7, L);

        System.out.println(L.size());
        for (int k = 0; k < L.size(); k++) {
            System.out.println(L.get(k));
        }
        
    }
}
