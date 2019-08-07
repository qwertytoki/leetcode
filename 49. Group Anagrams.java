import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupList = new ArrayList<>();
        
        for(int i = 0;i<strs.length;i++){
            String str = strs[i];
            boolean isNew = true;

            for(List<String> group:groupList){
                String target  = group.get(0);
                if(target.length()!=str.length()){
                    continue;
                }
                String[] targetArray = target.split("");
                String[] strArray = str.split("");
                for(String str:strArray){
                    if(!targetArray.contains(str)){
                        isNew = false;
                    }
                }
                
                
            }

            if(isNew){
                // add this new group to result
                groupList.add(arrays.asList(str));
            }
        }
        

        List<List<String>> sameCharsList = new ArrayList<>();
        for(String s:strs){
            Map<Character,Character> group = new HashMap<>();
            for(Map<Character,Character> sameChars:sameCharsList){
                for(int i=0;i<s.length();i++){
                    if(sameChars.get(s.charAt(i))==null){
                        // it's wrong group
                        break;
                    }
                }
                // it's same group

                

            }
                for(int i=0;i<s.length();i++){
                    group.put(s.charAt(i),s.charAt(i));
                }
            }
            
            sameCharsList.add(group);
        }       
    }
}