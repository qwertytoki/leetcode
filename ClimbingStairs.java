class Solution {
    public int climbStairs(int n) {
        if(n==0) return 1;
        int num = n;
        int count = 0;
        int result = (n%2==0)?2:1;
        while(num > 2){
            count++;
            num= num-2;
        }
        for(int i=1;i<=count;i++){
            result = result + combination(--n, i);
        }
        return result;
    }
    private int combination(int n,int r){
        long result = 1;
        for(int i = 1;i<=r;i++){
            result = result * (n--)/i;
        }
        return (int)result;
    }
}