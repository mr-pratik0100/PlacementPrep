
*****************************************BEST TIME TO BUY AND SELL STOCK*********************************


class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit=0;
        int minBuy=prices[0];

        for(int i=1;i<prices.length;i++){
            if(prices[i]<minBuy){
                minBuy=prices[i];
            }
            int profit=prices[i]-minBuy;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
        
    }
}
