package sg.kristjan.ctci;

import java.util.Arrays;

/**
 * Created by kristjan on 1/11/16.
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    private static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        return arr;
    }

}
