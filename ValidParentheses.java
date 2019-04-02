class Solution {
    public boolean isValid(String s) {
        List<Character> cList = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(isOpenBracket(c)){
                cList.add(c);
            }else{
                char pairCandidate = getOpenBracketPair(c);
                if(cList.size() == 0 || pairCandidate != cList.get(cList.size()-1)){
                    return false;
                }
                cList.remove(cList.size()-1);
            }
        }
        if(cList.size() != 0){
            return false;
        }
        return true;
    }
    private boolean isOpenBracket(char c){
        if(c ==')'||c =='}'||c ==']'){
            return false;
        }
        return true;
    }
    private char getOpenBracketPair(char c){
        switch(c){
        case ')':
            return '(';
        case '}':
            return '{';
        case ']':
            return '[';
        default:
            return ' ';
        }
    }
}