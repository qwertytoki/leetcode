import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows<1){
            return result;
        }
        result.add(Arrays.asList(1));
        for(int i=1;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            List<Integer> previousList = result.get(i-1);
            for(int j=0;j<=i;j++){
                int column = (j==0)?previousList.get(j):previousList.get(j-1);
                list.add(column);
            }
            result.add(list);
        }
        return result;
    }
}