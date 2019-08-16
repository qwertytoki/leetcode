class valueEntity{
    int lowIndex;
    int lowValue;
    int highIndex;
    int highValue;
}

import valueEntity;
class Solution {
    public int maxProfit(int[] prices) {
        // find the max profit 
        // only 2 transacitons are allowed
        // you must not hold multiple transactions in same time.
        int highestProfit = 0;
        //Compare 4 cases and return highest
        //1: 1 transaction case : buy lowest time, sell highest time
        //ex: [1,2,3,4,5]
        //2: 2 transactions, lowest and 2nd lowest are independent
        //ex: [1,3,0,3,5]
        //3: 2 transactions, lowest and 2nd lowest are before lowest
        //ex: [0,3,1,4,5]
        //4: 2 transactions, lowest and 2nd lowest are after highest
        //ex: [0,5,1,3,4]
        
        //1
        
        return highestProfit;

    }
    // key is index,value is price.
    // 1st item is lowest
    // 2nd item is highest
    private Map<Integer,Integer> getLowestPrices(int[] prices){
        Map<Integer,Integer> map = new LinkedHashMap<>();
        return map;
    }
}