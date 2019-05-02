class Solution {
    public int majorityElement(int[] nums) {
        // マジョリティ探し
        if(nums.length==1){
            return nums[0];
        }
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int num:nums){
            if(countMap.containsKey(num)){
                int a = countMap.get(num);
                a++;
                if(a>nums.length/2){
                    return num;
                }
                countMap.put(num,a);
            }else{
                countMap.put(num,1);
            }
        }
        throw new IllegalArgumentException("No Majority");
    }
}