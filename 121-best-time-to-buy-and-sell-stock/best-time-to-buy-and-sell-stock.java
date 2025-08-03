class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int low=prices[0];

        for(int i=1;i<prices.length;i++)
        {
            low=Math.min(low,prices[i]);
            if(low!=prices[i])
            {
                profit=Math.max(profit,prices[i]-low);
            }
        }
        return profit;
    }
}