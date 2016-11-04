package sg.kristjan.interviewcake.applestocks;


public class Test {
    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};
        Question q = new Question();
        assert 6 == q.getMaxProfit(stockPricesYesterday);
    }
}
