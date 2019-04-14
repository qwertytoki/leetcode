class Solution {
    public int maxProfit(int[] prices) {
        // 購入を複数回繰り返して良い
        // 単純に次で売ればいいわけではなく最大利益を考える必要がある
        // 1 5 99 100 だった場合にきちんと対応できるように
        // 5 3 1 7 9 3 100 この場合は1を買う
        // 1 5 7 6 100 この場合は売った方がいい
        // 価格が下がったところを検知し、その時一番高値で売る
        // 価格が下がらないなら売らない
        // 最初に買うのは下げ止まる寸前
        if(prices==null||prices.length ==0){
            return 0;
        }
        int currentMinBuy = prices[0];
        int currentMaxSell = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<currentMinBuy){
                currentMinBuy = prices[i];
                currentMaxSell = prices[i];
                continue;
            }
            if(prices[i]>currentMaxSell){
                currentMaxSell = prices[i];
            }else{
                profit = currentMaxSell - currentMinBuy;
                currentMinBuy = 0;
                currentMaxSell = 0;
            }
            
        }
        return profit;
    }
}