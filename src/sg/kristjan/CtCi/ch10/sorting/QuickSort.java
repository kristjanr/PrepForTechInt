package sg.kristjan.CtCi.ch10.sorting;

import java.util.Arrays;

/**
 * Created by kristjan on 1/11/16.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 7, 1, 2, 2, 2};
        int[] arr1 = new int[]{1,2,3,4};
        // sort(arr);
        sort(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    private static void sort(int[] arr) {
        if (arr == null) return;
        if (arr.length == 0) return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        System.out.println("foo");
        int index = partition(arr, left, right); // partition and return the index which is the ???
        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];
        while (left <= right) {
            while (arr[left] < pivot) left += 1;
            while (arr[right] > pivot) right -= 1;
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left += 1;
                right -= 1;
            }
        }
        return left;
    }

}
