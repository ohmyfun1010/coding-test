package org.src;

public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;

        int[] dailyPriceDiff = new int[prices.length - 1];

        for (int i = 0; i < prices.length - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            dailyPriceDiff[i] = diff;
        }

        for (int i = 0; i < dailyPriceDiff.length; i++) {
            if (dailyPriceDiff[i] > 0) {
                totalProfit += dailyPriceDiff[i];
            }
        }

        return totalProfit;
    }
    public static void main(String[] argc){
        BestTimetoBuyandSellStockII main = new BestTimetoBuyandSellStockII();
        System.out.println(main.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
