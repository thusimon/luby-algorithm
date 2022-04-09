package com.luby.algo.questions;

public class Q121 {
  public class Solution {
    /**
     * given an array prices where prices[i] is the price of a given stock on the ith day.
     * maximize your profit by choosing a single day to buy one stock
     * and choosing a different day in the future to sell that stock.
     * e.g prices = [7,1,5,3,6,4]
     * output = 5, buy at 1, sell at 6
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
      if (prices == null || prices.length < 1) {
        return 0;
      }
      int minVal = Integer.MAX_VALUE;
      int overallProfit = 0;
      int todayProfit = 0;
      for (int i = 0; i < prices.length; i++) {
        if (prices[i] < minVal) {
          minVal = prices[i];
        }
        todayProfit = prices[i] - minVal;
        if (todayProfit > overallProfit) {
          overallProfit = todayProfit;
        }
      }
      return overallProfit;
    }
  }
  public static void main(String[] args) {
    Solution s = new Q121().new Solution();
    int[] prices1 = new int[] {7, 1, 5, 3, 6, 4};
    int[] prices2 = new int[] {7, 6, 4, 3, 1};
    int[] prices3 = new int[] {2, 4, 1};
    int[] prices4 = new int[] {7, 2, 4, 1};
    System.out.println(s.maxProfit(prices1));
    System.out.println(s.maxProfit(prices2));
    System.out.println(s.maxProfit(prices3));
    System.out.println(s.maxProfit(prices4));
  }
}
