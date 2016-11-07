package sg.kristjan.interviewcake.productofothernumbers;


import java.util.Arrays;

class QuestionIterativeBetter {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 7, 3, 4};
        System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex(arr)));
    }

    public static long[] getProductsOfAllIntsExceptAtIndex(int[] arr) {
        if (arr == null) return null;
        long[] res = new long[arr.length];
        if (arr.length == 1) res[0] = 0;
        long[] subProductsForward = new long[arr.length];
        for (int i = 0, j = arr.length - 1; i <= arr.length - 1; i++, j--) {
            if (i == 0) {
                subProductsForward[i] = 1;
            } else {
                subProductsForward[i] = subProductsForward[i - 1] * arr[i - 1];
            }
        }

        long[] subProductsBackwards = new long[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                subProductsBackwards[i] = 1;
            } else {
                subProductsBackwards[i] = subProductsBackwards[i + 1] * arr[i + 1];
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            res[i] = subProductsForward[i] * subProductsBackwards[i];
        }
        return res;
    }
}