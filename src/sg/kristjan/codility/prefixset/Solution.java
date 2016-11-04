package sg.kristjan.codility.prefixset;

class Solution {
    public int solution(int[] A) {
        boolean[] existence = new boolean[1000000];
        // this is guaranteed to change as per the promises from the task
        int lastToBeUnique = 0;
        for (int n : A) {
            if (!existence[n]) lastToBeUnique = n;
            existence[n] = true;
        }
        for (int i = 0; i <= A.length - 1; i++) {
            if (A[i] == lastToBeUnique) return i;
        }
        // should never returned here as per the promises from the task
        return 0;
    }
}