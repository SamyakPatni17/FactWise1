public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            int currentProfit = currentPrice - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
            minPrice = Math.min(minPrice, currentPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit calprofit = new MaxProfit();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int result = calprofit.maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}