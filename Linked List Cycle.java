/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // 定数メモリで解けるか？
        // エラーになる点を探せばいい
        // posが0未満または、配列以上なら良い
        Set<ListNode>nodeSet = new HashSet<>();
        while(head != null){
            if(nodeSet.contains(head)){
                return true;
            }
            nodeSet.add(head);
            head = head.next;
        }        
        return false;
    }
}