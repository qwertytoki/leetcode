class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            set.add(i);
        }
        int[] intersectedArray = new int[set.size()];
        int index = 0;
        for(int i:set){
            intersectedArray[index] = i;
            index++;
        }
        return intersectedArray;
    }
}