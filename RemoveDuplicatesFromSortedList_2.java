/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode result;
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(head.next !=null){
            if(head.val == current.next.val){
                head.next = head.next.next;
                current = head.next.next;
            }
            current = head.next;
        
        }
        return head;
    }
}