public class FillGrid {
    public int[][] fill_grid(int[] ll, int[] ur, int[][] s) {
        int wizPos_up = 0;
        int wizPos_down = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                if (j > i) {
                    s[i][j] = ur[wizPos_up];
                    wizPos_up++;
                } else if (j < i) {
                    s[i][j] = ll[wizPos_down];
                    wizPos_down++;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] LL = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0};
        int[] UR = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[][] S = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        FillGrid a = new FillGrid();
        int[][] returned_s = a.fill_grid(LL, UR, S);
        for (int i = 0; i < returned_s.length; i++) {
            for (int j = 0; j < returned_s[i].length; j++) {
                System.out.println(returned_s[i][j]);
            }
        }
    }
}
