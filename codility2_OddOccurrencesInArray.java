// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i :A){
            if(stack.peek()==null||stack.peek()!=i){
                stack.add(i);
            }else{
                stack.pop();
            }
        }
        return stack.peek();
    }
}