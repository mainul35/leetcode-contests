package freesolve.leetcode;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
//        int[] prices = new int[] {7,1,5,3,6,4};
//      int[] prices = new int[] {7,6,4,3,1};
//      int[] prices = new int[] {3, 3};
//      int[] prices = new int[] {1, 2, 4};
      int[] prices = new int[] {2, 4, 1};
        System.out.println (maxProfit (prices));
    }

    public static int maxProfit(int[] prices) {
        int min = 0;
        int max = 0;
        int[] profits = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[min]) {
                min = i;
                max = i;
            }

            if (prices[i] > prices[max]) {
                max = i;
            }
            profits[i] = prices[max] - prices[min];
        }

        int maxProfit = 0;
        for (int profit : profits) {
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
