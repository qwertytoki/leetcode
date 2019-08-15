class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        Set<Integer> matchedSet = new HashSet<>();
        for(int i:set){
            if(IntStream.of(nums2).anyMatch(x -> x == i)){
                matchedSet.add(i);
            }
        }
        int[] array =  new int[matchedSet.size()];
        int i=0;
        for(int val:matchedSet){
            array[i]=val;
            i++;
        }
        return array;
    }
}