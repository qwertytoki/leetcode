import java.util.List;

class Solution {
    public boolean isPalindrome(int x) {
        if(x%10 == 0 || x<0) return false;
        List<Integer>xList = new ArrayList<>();
        while(x!=0){
            xList.add(x % 10);
            x /=10;
        }
        while(xList.size()>1){
            if(xList.get(0) != xList.get(xList.size()-1)) return false;
            xList.remove(0);
            xList.remove(xList.size()-2);
        }
        return true;
    }
}