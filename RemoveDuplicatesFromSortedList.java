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
        // 次の値が今のvalと違えば、resultのNextにheadNextを入れる
        if(result == null){
            result = new ListNode(head.val);
        }
        if(head.next == null){
            return result;
        }
        if(result.val != head.next.val){
            result.next = new ListNode(head.next.val);
        }
        deleteDuplicates(head.next);
        return null;
    }
}