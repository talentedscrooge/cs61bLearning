public class ArrayMethod {
    public static int[] insert(int[] arr, int item, int position) {
        if (position == 0) {
            int[] newone = new int[arr.length + 1];
            newone[0] = item;
            System.arraycopy(arr, 0, newone, 1, arr.length);
            return newone;
        } else if (position < arr.length) {
            int[] newone = new int[arr.length + 1];
            newone[position] = item;
            System.arraycopy(arr, 0, newone, 0, position);
            System.arraycopy(arr, position, newone, position + 1, arr.length - position);
            return newone;
        } else {
            int[] newone = new int[arr.length + 1];
            System.arraycopy(arr, 0, newone, 0, arr.length);
            newone[arr.length] = item;
            return newone;
        }
    }

    public static int[] reverse(int[] arr) {
        int[] reversed_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed_arr[i] = arr[arr.length - 1 - i];
        }
        return reversed_arr;
    }


    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        //int[] b = insert(a, 111, 0);
        int[] c = reverse(a);
    }
}
