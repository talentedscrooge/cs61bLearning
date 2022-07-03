public class B extends A {
    public void m2() {
        System.out.println("Bm2-> " + x);
    }

    public void m2(int y) {
        System.out.println("Bm2y-> " + y);
    }

    public void m3() {
        System.out.println("Bm3-> " + "called");
    }

    public static void main(String[] args) {
        B b = new B();
        b.m2(2);
    }
}
