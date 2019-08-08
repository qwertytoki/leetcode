// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.lang.Number;

class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        System.out.println(binary);
        String[] bArray = binary.split("");
        int longestCount = 0;
        int currentCount = 0;
        boolean isStart = false;
        for(String s:bArray){
            int i =Integer.parseInt(s);
            if(!isStart && i==0){
                continue;
            }else if(!isStart && i==1){
                isStart = true;
                continue;
            }else if(isStart && i==0){
                currentCount++;    
            }else if(isStart && i==1){
                longestCount = currentCount>longestCount?currentCount:longestCount;
                currentCount = 0;
            }
        }
        return longestCount;
    }
}
