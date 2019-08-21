package easy.Middle_of_the_Linked_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {

        int size = 0;

        ListNode currentNode = head;

        /* Calculate the size of the list */
        while(currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }

        /* iterate until the middle value */
        for(int i=1; i<=size/2; i++) {
            head = head.next;
        }

        return head;
    }
}
