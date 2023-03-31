class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0||prices.length==1)
            return 0;
        int minPrice=prices[0],maxPorfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(maxPorfit<prices[i]-minPrice)
            {
                maxPorfit=prices[i]-minPrice;
            }
            if(minPrice>prices[i])
            {
                minPrice=prices[i];
            }
        }
	return maxPorfit;
    }
} 