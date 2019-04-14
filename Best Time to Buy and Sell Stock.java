class Solution {
    public int maxProfit(int[] prices) {
        // 最も安い日に買って最も高い日に売る
        // 一番簡単なのは総当たり戦やってく方式
        // 最大値と最小値を持ってればいいかな
        if(prices==null){
            return 0;
        }
        int currentMinBuy = prices[0];
        int currentMaxSell = prices[0];
        for(int i=1;i<prices.size;i++){
            if(prices[i]<currentMinBuy){
                currentMinBuy = prices[i];
                currentMaxSell = prices[i];
            }
            if(prices[i]>currentMaxSell){
                currentMaxSell = prices[i];
            }
        }
        return currentMaxSell-currentMinBuy;
    }
}