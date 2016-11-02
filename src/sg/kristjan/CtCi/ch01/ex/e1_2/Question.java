package sg.kristjan.CtCi.ch01.ex.e1_2;


import java.util.Arrays;

public class Question {
    public static boolean isPermutation1(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] arr1 = sortedArray(s1);
        char[] arr2 = sortedArray(s2);
        if (Arrays.equals(arr1, arr2)) return true;
        return false;
    }

    private static char[] sortedArray(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return arr;
    }
}