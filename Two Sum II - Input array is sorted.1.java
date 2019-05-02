class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(target<=numbers[0]){
            return new int[]{};
        }
        Map<int,int> twoSumMap = new HashMap<>();
        for(int i=1;i<numbers.length+1;i++){
            twoSumMap.put(twoSum[i-1],i);
        }
        for(int i=1;i<numbers.length+1;i++){
            int targetCandi =  target-numbers[i-1]
            if(twoSumMap.get(targetCandi)!=null){
                return new int[]{i,twoSumMap.get(targetCandi)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}