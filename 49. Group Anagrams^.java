import java.util.HashMap;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
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
        for(String aPart:a.split("")){
            boolean bool = false;
            for(String bPart:b.split("")){
                if(aPart.equals(bPart)){
                    bool = true;
                }
            }
            if(!bool){
                return false;
            }
        }
        return true;
    }
}