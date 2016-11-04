package sg.kristjan.ctci.ch10.sorting;

import java.util.Arrays;

/**
 * Created by kristjan on 1/11/16.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = new int[]{111, 32, 13, 24, 5, 6, 7, 8, 1, 2, 2, 2, 3, 4, 3, 2, 4, 5, 6};
        int[] arr = new int[]{3, 2};
        sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    private static void sort(int[] arr) {
        if (arr == null) return;
        if (arr.length == 0) return;
        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low >= high) return;
        int middle = (low + high) / 2;
        mergeSort(arr, helper, low, middle);
        mergeSort(arr, helper, middle + 1, high);
        merge(arr, helper, low, middle, high);

    }

    private static void merge(int[] arr, int[] helper, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }
        int helperLow = low;
        int helperHigh = middle + 1;
        int current = low;
        while (helperLow <= middle && helperHigh <= high) {
            if (helper[helperLow] <= helper[helperHigh]) {
                arr[current] = helper[helperLow];
                helperLow += 1;
            } else {
                arr[current] = helper[helperHigh];
                helperHigh += 1;
            }
            current += 1;
        }
        int remaining = middle - helperLow;
        for (int i = 0; i <= remaining; i++) {
            arr[current + i] = helper[helperLow + i];
        }
    }

}
