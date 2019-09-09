package medium.Next_Greater_Node_in_Linked_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {

        ListNode currentNode = head;
        int size = 0;

        while(currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }

        int[] result = new int[size];
        int count = 0;
        currentNode = head;

        while(currentNode != null) {
            int max = 0;
            ListNode tempNode = currentNode.next;
            while(tempNode != null) {
                if(tempNode.val > currentNode.val) {
                    max = tempNode.val;
                    break;
                }
                tempNode = tempNode.next;
            }

            result[count] = max;
                            currentNode = currentNode.next;
            count++;
        }

        return result;
    }
}
