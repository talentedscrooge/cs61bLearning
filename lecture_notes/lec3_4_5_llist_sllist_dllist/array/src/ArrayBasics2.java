public class ArrayBasics2 {
    public static void main(String[] args) {
        // There are three ways of initializing 2D ARRAY
        int[][] pascalsTriangle;
        pascalsTriangle = new int[4][];

        pascalsTriangle[0] = new int[]{1};
        pascalsTriangle[1] = new int[]{1, 1};
        pascalsTriangle[2] = new int[]{1, 2, 1};
        pascalsTriangle[3] = new int[]{1, 3, 3, 1};
        //could get reference elsewhere and mutation comes along!
        int[] rowTwo = pascalsTriangle[2];
        rowTwo[1] = -999;

        //Second way
        int[][] matrix;
        matrix = new int[4][4];

        //The third
        int[][] pascalAgain = new int[][]{{1},
                {1, 1},
                {1, 2, 1},
                {1, 3, 3, 1}};

    }
}
