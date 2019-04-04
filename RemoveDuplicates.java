class Solution {
    public int removeDuplicates(int[] nums) {
        int pointedNum = 0;
        int pointer = 0;
        int pointerMax = nums.length-1;
        int counter = 0;
        loop:for(counter=0 ; counter<nums.length;counter++){
            if(pointer>pointerMax) break;
            pointedNum = nums[pointer];
            if(counter!=0 && pointedNum == nums[counter-1] ){
                while(nums[counter-1]==pointedNum){
                    if(pointer>=pointerMax){
                        nums[counter] = pointedNum;
                        break loop;
                    }
                    pointer++;
                    pointedNum = nums[pointer];
                }
            }
            pointer++;
            nums[counter] = pointedNum;
        }
        return counter;
    }
}