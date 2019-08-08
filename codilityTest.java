// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // sort them
        // run them by using for()
        // ignore negative condition
        // find lack of them and return
        Arrays.sort(A);
        Set<Integer> setA = new HashSet<>();
        for(int i :A){
            setA.add(i);
        }
        for(int i=0;i<setA.size();i++){
            if(!setA.contains(i+1)){
                return i+1;
            }
        }
        return setA.size()+1;
    }