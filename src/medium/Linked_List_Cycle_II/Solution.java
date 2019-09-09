package medium.Linked_List_Cycle_II;

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
    public ListNode detectCycle(ListNode head) {
        ListNode currentNode = head;

        while(currentNode != null) {
            ListNode tempNode = head;
            while(tempNode != null) {
                if(currentNode.next == tempNode) {
                    return tempNode;
                } else if (currentNode == tempNode) {
                    break;
                }

                tempNode = tempNode.next;
            }
            currentNode = currentNode.next;
        }

        return null;

    }
}
