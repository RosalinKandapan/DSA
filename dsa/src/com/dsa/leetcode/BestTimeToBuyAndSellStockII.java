package com.dsa.leetcode;
/*
 * next day should greater than prev day
 * i > i-1
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1; i< prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                profit = profit + (prices[i]-prices[i-1]);
            }
        }
       return profit; 
    }
	

}
