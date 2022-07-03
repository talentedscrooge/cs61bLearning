public class print_stars {
    public static void Draw_tri(int a) {
        int index = 1;

        while (a >= index) {
            int i = 0;
            while (i < index) {
                System.out.print("*");
                i += 1;
            }
            System.out.println(" ");
            index += 1;
        }
    }

    public static void main(String[] args) {

        Draw_tri(3);
    }
}
