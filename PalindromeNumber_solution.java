import java.util.List;

class Solution {
    public boolean isPalindrome(int x) {
        // xが負の数またはxが0以外でmod10が0ならFalse
        if( x < 0 || x != 0 && x % 10 == 0){
            return false;
        }
        int reversed = 0;
        int original = x;
        while(x != 0){
            // このやり方で反転する方法覚えておきたい
            reversed = reversed*10 + x%10;
            x = x/10;
        }
        return reversed == original;
    }
}