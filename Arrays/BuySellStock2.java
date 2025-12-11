//Leetcode 122. Best Time to Buy and Sell Stock II
/*Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
*/
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;

        for(int i=0;i<n-1;i++){
           if(prices[i]<prices[i+1]){
            maxProfit+=prices[i+1]-prices[i];
           }
        }
        return maxProfit;
    }
}
