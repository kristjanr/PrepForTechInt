package sg.kristjan.ctci.ch10.sorting;

import java.util.Arrays;

/**
 * Created by kristjan on 1/11/16.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{111, 32, 13, 24, 5, 6, 7, 8, 1, 2, 2, 2, 3, 4, 3, 2, 4, 5, 6};
        System.out.println(Arrays.toString(sort(arr)));
    }

    private static int[] sort(int[] arr) {
        if (arr == null) return null;
        for (int ignored : arr) {
            for (int i = 0; i <= arr.length - 2; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}
