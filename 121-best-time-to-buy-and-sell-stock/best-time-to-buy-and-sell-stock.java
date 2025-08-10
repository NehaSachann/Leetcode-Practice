class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int price=prices[0];
        for(int i=0; i<prices.length; i++){
            if(price>prices[i]){
                price=prices[i];
            }
            max=Math.max(max, prices[i]-price);
        }
        return max;
    }
}