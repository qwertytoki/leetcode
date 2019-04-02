class Solution {
    public String longestCommonPrefix(String[] strs) {
        int strLen = strs.length !=0 ?strs[0].length():0;
        String commonPrefix = "";
        for(int i=1; i<strs.length; i++){
            strLen = strs[i].length()<strLen ?strs[i].length():strLen;
        }
        for(int i = 0;i<strLen;i++){
            char[] chars = new char[strs.length];
            for(int j = 0 ;j<strs.length;j++){
                chars[j] = strs[j].charAt(i);
                if(j!=0 && chars[j]!=chars[j-1]){
                    return commonPrefix;
                }
            }
            commonPrefix = commonPrefix + chars[0];
        }
        return commonPrefix;
    }
}