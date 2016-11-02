package sg.kristjan.CtCi.ch10.ex10_1;

import java.util.Arrays;

/**
 * Created by kristjan on 1/11/16.
 */
public class Question {

    public class Testt {

    }
    public static void main(String[] args) {
        int[] a = new int[9];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        a[5] = 5;
        int[] b = new int[]{1, 3, 5};
        System.out.println(Arrays.toString(sortedMerge(a, b)));
    }

    private static int[] sortedMerge(int[] a, int[] b) {
        for (int bb : b) {
            for (int i = 0; i <= a.length - 1; i++) {
                if (bb > a[i]) continue;
                // shift
                for (int j = a.length - 1; j >= i + 1; j--) {
                    a[j] = a[j - 1];
                }
                // insert bc val
                a[i] = bb;
                break;
            }
        }
        return a;
    }
}
