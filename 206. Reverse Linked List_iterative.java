import java.util.ArrayDeque;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head ==null) return head;
        Deque<ListNode> dq = new ArrayDeque<>();
        while(head!=null){
            dq.push(new ListNode(head.val));
            head = head.next;
        }
        ListNode currentNode = new ListNode(dq.pop().val);
        ListNode reversedNode = currentNode;
        while(dq.peek()!=null){
            currentNode.next= new ListNode(dq.pop().val);
            currentNode = currentNode.next;
        }
        return reversedNode;
    }
}