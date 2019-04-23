class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(target<=numbers[0]){
            return new int[]{};
        }
        int[] result = new int[2];
        int targetCandi = 0;
        for(int i = 0;i<numbers.length;i++){
            targetCandi = target - numbers[i];
            if(numbers.contains(targetCandi)){
                result[0] = i+1;
                for (int j=i+1;j<numbers.length;j++){
                    if(j==targetCandi){
                        return new int[]{i+1,j;1};
                    }
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}