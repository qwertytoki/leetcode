class KthLargest {
    int[] targetArray;
    int returnVal = 0;
    public KthLargest(int k, int[] nums) {
        targetArray = nums;
        targetArray = Arrays.sort(targetArray,Collection.reverseOrder());
        returnVal = targetArray[k];
    }
    
    public int add(int val) {
        targetArray.add(val);
        if(val<returnVal){
            return returnVal;
        }
        targetArray = Arrays.sort(targetArray,Collection.reverseOrder());
        returnVal = targetArray[k];
    }
}


/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */