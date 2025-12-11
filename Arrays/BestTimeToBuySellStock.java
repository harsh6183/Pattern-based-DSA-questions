//Leetcode 121. Best Time to Buy and Sell Stock
// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
class Solution {
    public int maxProfit(int[] prices) {
         int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrices){
                minPrices=prices[i];
            }else if(prices[i]-minPrices>maxProfit){
                maxProfit=prices[i]-minPrices;
            }
        }
        return maxProfit;
    }
}

//Solution 2 same logic naming difference
class Solution {
    public int maxProfit(int[] prices) {
         int n= prices.length;
         int buy_prices=Integer.MAX_VALUE;
         int maxProfit=0;

         for(int i=0;i<n;i++){
            int current_profit=prices[i]-buy_prices;
            if(current_profit>maxProfit){
                maxProfit=current_profit;
            }else if(prices[i]<buy_prices){
                buy_prices=prices[i];
            }
         }
         return maxProfit;
    }
}
