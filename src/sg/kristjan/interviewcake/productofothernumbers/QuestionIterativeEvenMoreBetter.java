package sg.kristjan.interviewcake.productofothernumbers;


import java.util.Arrays;

class QuestionIterativeEvenMoreBetter {
    public static void main(String[] args) {
        int[] arr1 = new int[]{};
        System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex(arr1)));
        int[] arr2 = new int[]{3};
        System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex(arr2)));
        int[] arr3 = new int[]{1, 7, 3, 4};
        System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex(arr3)));
    }

    public static long[] getProductsOfAllIntsExceptAtIndex(int[] arr) {
        if (arr == null) return null;
        long[] res = new long[arr.length];

        long productSoFar = 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            res[i] = productSoFar;
            productSoFar = productSoFar * arr[i];
        }

        productSoFar = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] *= productSoFar;
            productSoFar = productSoFar * arr[i];
        }

        return res;
    }
}