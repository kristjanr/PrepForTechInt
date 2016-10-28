package sg.kristjan;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 2, 3);
        System.out.println(binarySum(data, 0, data.size()));
        System.out.println(factorial(4));
        countPermutations("foobar", "");
    }

    private static Integer binarySum(List<Integer> data, int i, int size) {
        return null;
    }

    private static int factorial(int n) {
        if (n < 0) return -1;
        if (n == 0) return 1;
        int result = n;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        return result;
    }

    private static int countPermutations(String str, String prefix){
        System.out.println(str.substring(str.length()));
        return 0;
    }
}
