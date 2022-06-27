public class Flatten {
    public static int[] flatten(int[][] x) {
        int totalLength = 0;

        for (int i = 0; i < x.length; i++) {
            totalLength += x[i].length;
        }

        int[] a = new int[totalLength];
        int aIndex = 0;

        for (int i = 0; i < x.length; i++) {
            for (int k = 0; k < x[i].length; k++) {
                if (!(x[i].length == 0)) {
                    a[aIndex] = x[i][k];
                    aIndex += 1;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {}, {7, 8}};
        int[] b = flatten(a);
    }
}
