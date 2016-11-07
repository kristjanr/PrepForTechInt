package sg.kristjan.interviewcake.highestproductofthree;


import java.util.Arrays;
// https://www.interviewcake.com/question/java/highest-product-of-3
class Question {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -7, 3, 4};
        System.out.println(highestProduct(arr));
    }

    public static long highestProduct(int[] arr) {
        Arrays.sort(arr);
        long first = arr[0] * arr[1] * arr[arr.length - 1];
        long second = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        if (first > second) return first;
        return second;
    }
}