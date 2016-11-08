package sg.kristjan.ctci.ch08.ex8_1;

/**
 * Created by kristjan on 8/11/16.
 */
public class QuestionSimplerAndBetter {
    public static void main(String[] args) {
        int stepsOnStaircase = 99;
        System.out.println(countWays(stepsOnStaircase));
    }

    // so we have an input which is  the number of steps in the staircase and and output which will be the possbile ways
    // the staircase can be hopped, given that each hop can be 1-3 steps long. 1,2,3 is hardcoded
    private static int countWays(int n, int[] memo) {
        // What is the very last step that is done? it will be either hop from n-1 to n or from n-2 to n or n-3 to n.
        // the subproblem is, in how many ways can we get to the n-1, n-2 and n-3 steps?
        // so what will be the starting case?
        // if we have only one step left, return 1 if 2 steps left, return 2 (2 step hop or 1+1 step hop),
        // if we have three steps left, return 4 (111,12,21,3)

        if (memo[n] == -1) {
            memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo);
        }

        return memo[n];

    }

    public static int countWays(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i <= memo.length - 1; i++) {
            memo[i] = -1;
        }
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;
        return countWays(n, memo);
    }
}
