package easy.Remove_Linked_List_Elements;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val) {
            head = head.next;
        }

        if(head == null) {
            return null;
        }

        ListNode current = head;

        while(current.next != null) {
            if(current.next.val == val) {
                current.next = current.next.next;
                continue;
            }

            current = current.next;
        }

        return head;
    }
}
