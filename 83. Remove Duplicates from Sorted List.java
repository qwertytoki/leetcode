/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        while (head.next != null && head.val == head.next.val) {
            head.next = head.next.next;
        }
        deleteDuplicates(head.next);
        return head;
    }
}