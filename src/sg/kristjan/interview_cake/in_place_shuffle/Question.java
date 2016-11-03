package sg.kristjan.interview_cake.in_place_shuffle;


import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

class Question {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int getRandom(int floor, int ceiling) {
        return ThreadLocalRandom.current().nextInt(floor, ceiling);
    }

    //    Write a function for doing an in-place ↴ shuffle of an array.
//    The shuffle must be "uniform," meaning each item in the original array must have the same probability of ending up in each spot in the final array.
//
//    Assume that you have a function getRandom(floor, ceiling) for getting a random integer that is >= floor and <= ceiling.
    public static void shuffle(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        for (int i = 0; i <= arr.length - 1; i++) {
            int index = getRandom(i, arr.length);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}