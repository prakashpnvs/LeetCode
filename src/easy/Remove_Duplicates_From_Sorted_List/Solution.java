package easy.Remove_Duplicates_From_Sorted_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode currentNode = head;

        if(currentNode == null) {
            return null;
        }

        while(currentNode.next != null) {
            if(currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
                continue;
            }
            currentNode = currentNode.next;
        }

        return head;

    }
}
