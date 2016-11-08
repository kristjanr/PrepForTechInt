package sg.kristjan.ctci.ch05.ex5_1;

/**
 * Created by kristjan on 8/11/16.
 */


class Question {
    public static void main(String[] args) {
        int N = Integer.parseInt("10000000000", 2);
        int M = Integer.parseInt("10011", 2);
        int i = 2;
        int j = 6;
        final int result = insertion(M, N, i, j);
        System.out.println(Integer.toBinaryString(result));
    }

    public static int insertion(int M, int N, int i, int j) {
        // Create the mask to clear N from j to i
        // for 10000000000 and j=6, i=2 it would be 11110000011
        int allOnes = ~0;
        int left = allOnes << (j + 1);
        int right = ~(allOnes << i);
        int mask = left | right;
        System.out.println(Integer.toBinaryString(left));
        System.out.println(Integer.toBinaryString(right));
        System.out.println(Integer.toBinaryString(mask));
        N = N & mask;
        System.out.println(Integer.toBinaryString(N));

        // shift the M
        M = M << i;
        System.out.println(Integer.toBinaryString(M));

        // OR N, M
        return N | M;
    }
}
