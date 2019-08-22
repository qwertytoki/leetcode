class Solution {
    public int maxProfit(int[] prices) {
        // find the max profit 
        // only 2 transacitons are allowed
        // you must not hold multiple transactions in same time.
        /**
         * Compare 4 cases and return highest
         * 1: 1 transaction case : buy lowest time, sell highest time
         * ex: [1,2,3,4,5]
         * 2: 2 transactions, 2nd lowest locates between lowest and highest
         * ex: [0,3,2,3,5]
         * 3: 2 transactions, 2nd lowest locates before lowest
         * ex: [1,3,0,4,5]
         * 4: 2 transactions, 2nd lowest locates after highest
         * ex: [0,5,1,3,4]
         */
        
        
        int highestProfit = 0;

        //1
        int lengthIndex = prices.length-1;
        int[] lowest =  getLowestPricesInTerm(prices);
        int[] highest = getHighestPricesInTerm(Arrays.copyOfRange(prices,lowest[1],lengthIndex));
        highestProfit = Math.max(highestProfit, highest[0]-lowest[0]);
        int[] secondLow;
        int[] secondHigh;

        // need to consider "index out of bounds"
        //2
        if(lowest[1]+1<=highest[1]-1){
            secondLow = getLowestPricesInTerm(Arrays.copyOfRange(prices,lowest[1]+1,highest[1]-1));
            secondHigh = getLowestPricesInTerm(Arrays.copyOfRange(prices,secondLow[1],highest[1]-1));
            highestProfit = Math.max(highestProfit, secondHigh[0]-lowest[0] + highest[0]-secondLow[0]);
        }
        
        //3
        if(lowest[1]-1>0){
            secondLow = getLowestPricesInTerm(Arrays.copyOfRange(prices,0,lowest[1]-1));
            secondHigh = getLowestPricesInTerm(Arrays.copyOfRange(prices,secondLow[1],lowest[1]-1));
            highestProfit = Math.max(highestProfit, secondHigh[0]-secondLow[0] + highest[0]-lowest[0]);
        }
        
        //4
        if(highest[1]+1<lengthIndex){
            secondLow = getLowestPricesInTerm(Arrays.copyOfRange(prices,highest[1]+1,lengthIndex));
            secondHigh = getLowestPricesInTerm(Arrays.copyOfRange(prices,secondLow[1],lengthIndex));
            highestProfit = Math.max(highestProfit, secondHigh[0]-secondLow[0] + highest[0]-lowest[0]);
        }
        
        
        return highestProfit;

    }

    // Return Array means..
    // 1st lowest value 
    // 2nd index
    private int[] getLowestPricesInTerm(int[] prices){
        int lowest = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowest){
                lowest = prices[i];
                index = i;
            }
        }
        return new int[]{lowest,index};
    }
    // Return Array means..
    // 1st highestvalue 
    // 2nd index
    private int[] getHighestPricesInTerm(int[] prices){
        int highest = -1;
        int index = -1;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>highest){
                highest = prices[i];
                index = i;
            }
        }
        return new int[]{highest,index};
    }
}