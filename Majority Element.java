class Solution {
    public int majorityElement(int[] nums) {
        // マジョリティ探し
        Map<Integer,Integer> countMap = new HashMap()<>;
        for(int num:nums){
            if(countMap.contains(num)){
                int a =countMap.get(num)++;
                if(a>nums.length/2){
                    return a;
                }
                countMap.put(a);
            }else{
                countMap.put(num,1);
            }
        }
        throw new IllegalArgumentException("No Majority");
    }
}