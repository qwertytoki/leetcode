class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j)continue;
                if(nums[j]== target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no matching result");
    }
}