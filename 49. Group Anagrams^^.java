import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> groupMap = new HashMap<String, List>();
        for (String s : strs) {
            System.out.println(s);
            boolean isMatch = false;
            for (String key : groupMap.keySet()) {
                if (isContainsSameChar(s, key)) {
                    groupMap.get(key).add(s);
                    isMatch = true;
                    break;
                }
            }
            if(!isMatch){
                groupMap.put(s,new ArrayList());
                groupMap.get(s).add(s);
            }
        }
        return new ArrayList(groupMap.values());
    }


    private boolean isContainsSameChar(String a, String b) {
        if(a.length()!=b.length()) return false;
        String[] arrayA = a.split("");
        String[] arrayB = a.split("");

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        a = String.join("",arrayA);
        b = String.join("",arrayB);
        if(a.equals(b))return true;
        return false;
    }
}