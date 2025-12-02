package org.src;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            if (price < minPrice) {
                minPrice = price;
            }

            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;

    }

    public static void main(String[] argc){
        BestTimetoBuyandSellStock main = new BestTimetoBuyandSellStock();
        System.out.println(main.maxProfit(new int[]{7,1,5,3,6,4}));
    }

}
