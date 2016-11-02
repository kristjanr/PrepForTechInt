package sg.kristjan.CtCi.ch10.searching;

/**
 * Created by kristjan on 1/11/16.
 */
public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1, 2, 2, 3, 4};

        System.out.println(search(arr, 1));
        System.out.println(search(arr, 3));
        System.out.println(search(arr, 5));
    }

    private static Integer search(int[] arr, int i) {
        return binarySearch(arr, 0, arr.length - 1, i);
    }

    private static Integer binarySearch(int[] arr, int lower, int higher, int obj) {
        if (lower > higher) return null;
        int middle = (lower + higher) / 2;
        if (obj == arr[middle]) return middle;
        if (obj < arr[middle]) {
            return binarySearch(arr, lower, middle - 1, obj);
        } else {
            return binarySearch(arr, middle + 1, higher, obj);
        }
    }
}
