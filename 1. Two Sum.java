class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0 ;i<nums.length;i++){
            
            if(map.get(nums[i]) != null){
                int[] result = {map.get(nums[i]),i};
                return result;
            }
            map.put(target-nums[i],i);
        }
        return null;
    }
}