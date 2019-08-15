class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        int[] array = new int[set.size()];
        int index =0;
        for(int i:set){
            if(IntStream.of(number).anyMatch(x -> x == i)){
                array[index]= i;
                index++;
            }
        }
        return array;
    }
}