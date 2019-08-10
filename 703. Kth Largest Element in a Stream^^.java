import java.util.Arrays;
import java.util.PriorityQueue;

class KthLargest {
    final PriorityQueue<Integer> pq = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        
        for(int i :nums){
            pq.add(i);
        }
        while(pq.size() > k){
            pq.poll();
         }
    }
    
    public int add(int val) {
        if(pq.size()==0){}
            pq.add(val);
    }
        if(val>pq.peek()){
           pq.add(val);
           pq.poll(); 
        }
        return pq.peek();
    }
}