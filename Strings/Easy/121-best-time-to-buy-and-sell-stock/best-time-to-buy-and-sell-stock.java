class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0]; // Initialize buyPrice to the first price in the array 
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) { 
                // If the current price is lower than the buyPrice, update buyPrice 
                buyPrice = prices[i];
            } else {
                // Calculate the current profit by selling at the current price
                int curr_profit = prices[i] - buyPrice;
                // If the current profit is greater than max_profit, update max_profit  
                if (max_profit < curr_profit) {
                    max_profit = curr_profit;
                }
            }
        }
        return max_profit;
    }
}