package sg.kristjan.ctci.ch10.searching;

/**
 * Created by kristjan on 1/11/16.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1, 2, 2, 3, 4};

        System.out.println(search(arr, 1));
        System.out.println(search(arr, 3));
        System.out.println(search(arr, 5));
    }

    private static Integer search(int[] arr, int i) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < i) {
                left = mid + 1; // search right side
            } else if (i < arr[mid]) {
                right = mid - 1; //search left side
            } else {
                return mid;
            }
        }
        return null;
    }
}
