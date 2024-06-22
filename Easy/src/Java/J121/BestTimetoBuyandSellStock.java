package Java.J121;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        BestTimetoBuyandSellStock solution = new BestTimetoBuyandSellStock();
        System.out.println("Example 1: " + solution.maxProfit(prices1)); // Output: 5
        System.out.println("Example 2: " + solution.maxProfit(prices2)); // Output: 0

    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

}
