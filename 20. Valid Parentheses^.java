import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

import com.sun.jmx.remote.internal.ArrayQueue;

class Solution {
    private HashMap<String,String>bracketMap;

    public Solution() {
        bracketMap = new HashMap<>();
        bracketMap.put("}", "{");
        bracketMap.put(")", "(");
        bracketMap.put("]", "[");
    }

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
            if (bracketMap.get(s).equals(stackedS)) {
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
}