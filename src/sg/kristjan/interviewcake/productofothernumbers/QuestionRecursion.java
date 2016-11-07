package sg.kristjan.interviewcake.productofothernumbers;


import java.util.Arrays;

class QuestionRecursion {
    public static void main(String[] args) {
        int[] arr = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE};
        System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex(arr)));
    }

    public static long[] getProductsOfAllIntsExceptAtIndex(int[] arr) {
        if (arr == null) return null;
        long[] res = new long[arr.length];
        if (arr.length == 1) res[0] = arr[0];
        if (arr.length <= 1) return res;
        for (int i = 0; i <= arr.length - 1; i++) {
            res[i] = getProductExceptAtIndex(arr, 0, arr.length - 1, i);
        }
        return res;
    }

    private static long getProductExceptAtIndex(int[] arr, int left, int right, int index) {
        if (left > right) {
            return 1;
        } else if (left == right) {
            if (left == index) return 1;
            return arr[left];
        }
        int middle = (left + right) / 2; // but no division allowed!
        long leftProduct = getProductExceptAtIndex(arr, left, middle, index);
        long rightProduct = getProductExceptAtIndex(arr, middle + 1, right, index);
        return leftProduct * rightProduct;
    }
}



