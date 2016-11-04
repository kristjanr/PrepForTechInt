package sg.kristjan.interviewcake.applestocks;

/**
 * Writing programming interview questions hasn't made me rich. Maybe trading Apple stocks will.
 * Suppose we could access yesterday's stock prices as an array, where:
 * <p>
 * The indices are the time in minutes past trade opening time, which was 9:30am local time.
 * The values are the price in dollars of Apple stock at that time.
 * So if the stock cost $500 at 10:30am, stockPricesYesterday[60] = 500;.
 * <p>
 * Write an efficient function that takes stockPricesYesterday and returns the best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.
 * <p>
 * Solution:
 * - I need to find the smallest stock price of the day and a biggest price after the smallest one.
 * - I need to find the biggest stock price of the day a smallest price before the biggest one.
 */


public class Question {
    int getMaxProfit(int[] stockPricesYesterday) {
        // make sure we have at least 2 prices
        if (stockPricesYesterday.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }

        int biggest = Integer.MIN_VALUE;
        int biggestLocation = 0;
        for (int i = 0; i < stockPricesYesterday.length; i++) {
            int n = stockPricesYesterday[i];
            if (n > biggest) {
                biggest = n;
                biggestLocation = i;
            }
        }
        int smallestBeforeBiggest = Integer.MAX_VALUE;
        for (int i = biggestLocation; i >= 0; i--) {
            int n = stockPricesYesterday[i];
            if (n < smallestBeforeBiggest) {
                smallestBeforeBiggest = n;
            }
        }

        int smallest = Integer.MAX_VALUE;
        int smallestLocation = 0;
        for (int i = stockPricesYesterday.length - 1; i >= 0; i--) {
            int n = stockPricesYesterday[i];
            if (n < smallest) {
                smallest = n;
                smallestLocation = i;
            }
        }
        int biggestAfterSmallest = Integer.MIN_VALUE;
        for (int i = smallestLocation; i < stockPricesYesterday.length; i++) {
            int n = stockPricesYesterday[i];
            if (n > biggestAfterSmallest) {
                biggestAfterSmallest = n;
            }
        }
        int firstCandidateProfit = biggest - smallestBeforeBiggest;
        int secondCandidateProfit = biggestAfterSmallest - smallest;
        if (firstCandidateProfit >= secondCandidateProfit && firstCandidateProfit >= 0) {
            return firstCandidateProfit;
        } else if (firstCandidateProfit <= secondCandidateProfit &&  secondCandidateProfit >= 0){
            return secondCandidateProfit;
        } else {
            return 0;
        }
    }

}
