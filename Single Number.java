import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        // 配列ソートする
        // 前の数字と違えばreturn
        // 前の数字と同じなら次の数字を入れて進む
        Set<Integer>numsSet = new HashSet<>();
        for(int num:nums){
            if(!numsSet.contains(num)){
                numsSet.add(num);
            }else{
                numsSet.remove(num);
            }
        }
        Iterator<Integer> iterator = numsSet.iterator();
        return iterator.next();
    }
}