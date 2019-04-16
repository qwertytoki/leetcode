class Solution {
    public int maxProfit(int[] prices) {
        // 最も安い日に買って最も高い日に売る
        // 一番簡単なのは総当たり戦やってく方式
        // 最大値と最小値を持ってればいいかな
        // 比較対象が2つ以上あったとき、困るな。
        // 現時点での最高利益額を保存しておく必要がある
        if(prices==null||prices.length ==0){
            return 0;
        }
        int currentMinBuy = prices[0];
        int currentMaxSell = prices[0];
        int currentMaxProfit = currentMaxSell-currentMinBuy;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<currentMinBuy){
                currentMaxProfit = Math.max(currentMaxProfit,currentMaxSell-currentMinBuy);
                currentMinBuy = prices[i];
                currentMaxSell = prices[i];
            }
            if(prices[i]>currentMaxSell){
                currentMaxSell = prices[i];
            }
        }
        return Math.max(currentMaxProfit,currentMaxSell-currentMinBuy);
    }
}