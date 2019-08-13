class GetFirstNonRepeatChar {
    public String getFirstNonRepeatChar(String string){
        String[] strAry = string.split("");
        String pre = "";
        String cur = strAry[0];
        for(int i=1;i<strAry.length;i++){
            // compare with previous
            String s = strAry[i];
            if(cur.equals(s)&&cur.equals(pre)){
                return cur;
            }
            pre = cur;
            cur = s;
        }
        throw IllegalArgumentException("All character is repeated");
    }
}