package sg.kristjan.ctci.ch10.sorting;

import java.util.Arrays;

/**
 * Created by kristjan on 1/11/16.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{111, 32, 13, 24, 5, 6, 7, 8, 1, 2, 2, 2, 3, 4, 3, 2, 4, 5, 6};
        System.out.println(Arrays.toString(sort(arr)));
    }

    private static int[] sort(int[] arr) {
        if (arr == null) return null;
        if (arr.length == 0) return arr;
        for (int j = 0; j <= arr.length - 1; j++) {
            for (int i = j + 1; i <= arr.length - 1; i++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
