class Solution {
    public int singleNumber(int[] nums) {
        // 配列ソートする
        // 前の数字と違えばreturn
        // 前の数字と同じなら次の数字を入れて進む

        Arrays.sort(nums);
        int resultCandi = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=resultCandi){
                return resultCandi;
            }else{
                resultCandi= ++i;
            }
        }
        return resultCandi;
    }
}