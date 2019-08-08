// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if(A.length==0)return A;
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=A.length-1;i>=0;i--){
            q.add(A[i]);
        }
        for(int i=0;i<K;i++){
            int temp = q.poll();
            q.add(temp);
        }
        for(int i=A.length-1;i>=0;i--){
            A[i]= q.poll();   
        }
        return A;
    }
}
