class Solution {
    public int reverse(int x) {
        boolean isMinus = false;
        if(x<0){
            isMinus = true;
            x= x * -1;
        }
        String strX = String.valueOf(x);
		StringBuffer sb = new StringBuffer(strX);
        String dst = sb.reverse().toString();
        try{
            int result = Integer.parseInt(dst);
            if(isMinus) result = result*-1;
            return result;
        }catch(NumberFormatException e){
            return 0;
        }
    }
}