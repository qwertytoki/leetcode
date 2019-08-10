import java.util.Arrays;
import java.util.PriorityQueue;

class KthLargest {
    final PriorityQueue<Integer> pq = new PriorityQueue<>();
    int kth =0;

    public KthLargest(int k, int[] nums) {
        kth =k;

        for (int i : nums) {
            pq.add(i);
        }
        while (pq.size() > k) {
            pq.poll();
        }
    }

    public int add(int val) {
        if (kth > pq.size()) {
            pq.add(val);
        } else if (val > pq.peek()) {
            pq.add(val);
            pq.poll();
        }
        return pq.peek();
    }
}