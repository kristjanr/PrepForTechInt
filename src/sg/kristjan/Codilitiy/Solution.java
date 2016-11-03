package sg.kristjan.Codilitiy;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// TODO:
// implement naive, brute force solution
// pass tests
// corner cases
// large inputs (use long for sums)
// assess big oh and do better if possible

// create a new array with the same length as original
// compute the sums of the items until current position from the start
// create another array with the same length as original
// compute the sums of the items until current position from the end
// step through both arrays simultaneously and compare first array leftside with second array rightside


class Solution {
    public int solution(int[] A) {
        if (A.length <= 1) return 0;

        long[] prefixSums = new long[A.length];
        for (int i = 0; i <= A.length - 1; i++) {
            if (i > 0) {
                prefixSums[i] += prefixSums[i - 1];
            }
            prefixSums[i] += A[i];
        }

        long[] suffixsSums = new long[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            if (i < A.length - 1) {
                suffixsSums[i] += suffixsSums[i + 1];
            }
            suffixsSums[i] += A[i];
        }

        for (int i = 0; i <= A.length - 1; i++) {
            if (i > 0 && i < A.length - 1 && prefixSums[i - 1] == suffixsSums[i + 1]) return i;
            if (i == 0 && 0 == suffixsSums[i + 1]) return i;
            if (i == A.length - 1 && prefixSums[i - 1] == 0) return i;
        }

        return -1;
    }
}