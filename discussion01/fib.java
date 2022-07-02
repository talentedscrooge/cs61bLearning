public class fib {
    public static int fib_gen(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib_gen(n - 2) + fib_gen(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int result = fib_gen(n);
        System.out.println("Fib(" + n + ") equals to " + result);
    }
}

