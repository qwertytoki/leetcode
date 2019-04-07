class Solution {
    public int climbStairs(int n) {
        int num = n;
        int count = 0;
        inr result = 1;
        while(num < 2){
            count++;
            num= num-2;
        }
        for(int i=1;i<=count;i++){
            result = result + conbination(--n, i);
        }
        return result+1;
    }
    private int conbination(int n,int r){
        int result = 0;
        for(int i = 1;i<=r;i++){
            result = result * (n--)/i;
        }
        return result;
    }
}