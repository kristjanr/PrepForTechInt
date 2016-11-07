package sg.kristjan.interviewcake.makingchange;

import java.util.Arrays;

/**
 * Created by kristjan on 7/11/16.
 */
public class QuestionBetter {
    public static void main(String[] args) {
        int[] denom = new int[]{1, 2, 3};
        System.out.println(changePossibilitiesTopDown(4, denom));
    }

    public static int changePossibilitiesTopDown(int amountLeft, int[] denominations) {
        return changePossibilitiesTopDown(amountLeft, denominations, 0);
    }

    public static int changePossibilitiesTopDown(int amountLeft, int[] denominations, int currentIndex) {

        // base cases:
        // we hit the amount spot on. yes!
        if (amountLeft == 0) return 1;

        // we overshot the amount left (used too many coins)
        if (amountLeft < 0) return 0;

        // we're out of denominations
        if (currentIndex == denominations.length) return 0;

        System.out.println("checking ways to make " + amountLeft + " with "
                + Arrays.toString(Arrays.copyOfRange(denominations, currentIndex, denominations.length)));

        // choose a current coin
        int currentCoin = denominations[currentIndex];

        // see how many possibilities we can get
        // for each number of times to use currentCoin
        int numPossibilities = 0;
        while (amountLeft >= 0) {
            numPossibilities += changePossibilitiesTopDown(amountLeft, denominations, currentIndex + 1);
            amountLeft -= currentCoin;
        }

        return numPossibilities;
    }
}
