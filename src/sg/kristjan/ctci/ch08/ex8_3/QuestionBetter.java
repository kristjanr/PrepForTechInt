package sg.kristjan.ctci.ch08.ex8_3;

/**
 * Created by kristjan on 8/11/16.
 */
class QuestionBetter {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1,};
        System.out.println(magicIndex(arr));
    }


    public static int magicIndex(int[] arr) {
        return magicIndex(arr, 0, arr.length - 1);
    }


    private static int magicIndex(int[] arr, int left, int right) {
        if (left > right) return -1;
        int middle = (left + right) / 2;
        if (arr[middle] == middle) return middle;


        final int leftSide = magicIndex(arr, left, Math.min(middle - 1, middle));
        if (leftSide != -1) return leftSide;
        return magicIndex(arr, Math.max(middle + 1, middle), right);
    }
}