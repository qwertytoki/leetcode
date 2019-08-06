import java.util.ArrayDeque;
import java.util.Deque;

import com.sun.jmx.remote.internal.ArrayQueue;

class Solution {
    public boolean isValid(String paramString) {
        if (paramString.equals("")) {
            return true;
        }
        Deque<String> stack = new ArrayDeque<>();
        for (String s : paramString.split("")) {
            String stackedS = stack.peek();
            if (stackedS == null) {
                stack.push(s);
                continue;
            }
            if (isMatchedBracket(stackedS, s)) {
                stack.pop();
            } else {
                stack.push(s);
            }
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    private boolean isMatchedBracket(String stackedS, String s) {
        if ((stackedS.equals("{") && s.equals("}")) || (stackedS.equals("(") && s.equals(")"))
                || (stackedS.equals("[") && s.equals("]"))) {
            return true;
        }
        return false;
    }
}