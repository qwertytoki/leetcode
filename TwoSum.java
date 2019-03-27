class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];        
        for(int i=0; i<nums.length; i++){            
            int lastTarget = target;
            result[0] = i;
            lastTarget = target - nums[i];
            if (isMatch(i,result,nums,lastTarget)){
                return result;
            }
        }
        return result;
    }
    
    private boolean isMatch(int index,int[] result ,int[] nums, int lastTarget){
        for(int i=index+1;i<nums.length; i++){
            if(nums[i] == lastTarget){
                result[1] = i;
                return true;
            }
        }
        return false;
    }
}