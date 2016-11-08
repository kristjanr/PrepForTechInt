package sg.kristjan.ctci.ch08.ex8_3;

/**
 * Created by kristjan on 8/11/16.
 */
class Question {
    public static void main(String[] args) {
        int[] arr = new int[]{-10, -2, -1, 0, 4, 5};
        System.out.println(magicIndex(arr));
    }

    public static int magicIndex(int[] arr) {
        return magicIndex(arr, 0, arr.length - 1);
    }

    private static int magicIndex(int[] arr, int left, int right) {
        if (left > right) return -1;
        int middle = (left + right) / 2;
        if (arr[middle] == middle) return middle;
        if (arr[middle] > middle) return magicIndex(arr, left, middle - 1);
        return magicIndex(arr, middle + 1, right);
    }
}