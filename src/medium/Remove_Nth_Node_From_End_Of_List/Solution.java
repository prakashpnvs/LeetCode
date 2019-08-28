package medium.Remove_Nth_Node_From_End_Of_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode currentNode = head;
        int size = 0;

        while(currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }

        int target = size - n;
        int count = 1;

        if(target == 0) {
            return head.next;
        }

        ListNode resultNode = head;

        while(resultNode.next != null) {
            if(count == target) {
                resultNode.next = resultNode.next.next;
                return head;
            }
            resultNode = resultNode.next;
            count++;
        }

        return null;

    }
}
