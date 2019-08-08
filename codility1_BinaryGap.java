// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.lang.Integer;

class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        String[] bArray = binary.split("");
        int longestCount = 0;
        int currentCount = 0;
        boolean isStart = false;
        for(String s:bArray){
            int i =Integer.parseInt(s);
            if(!isStart){
                isStart = i==1?true:false;
                continue;        
            }
            if(i==0){
                currentCount++;        
            }else{
                longestCount = currentCount>longestCount?currentCount:longestCount;
                currentCount = 0;    
            }
        }
        return longestCount;
    }
}