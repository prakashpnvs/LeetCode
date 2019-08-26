package easy.Merge_Two_Sorted_Lists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = null;

        /* Splice the two lists in ascending order */
        while(l1 != null && l2 != null) {
            if(l1 != null && l1.val <= l2.val) {
                result = insertAtEnd(result, l1.val);
                l1 = l1.next;
            } else {
                result = insertAtEnd(result, l2.val);
                l2 = l2.next;
            }
        }

        /* Attach the remaining elements */
        while(l1 != null) {
            result = insertAtEnd(result, l1.val);
            l1 = l1.next;
        }

        while(l2 != null) {
            result = insertAtEnd(result, l2.val);
            l2 = l2.next;
        }

        return result;

    }

    public ListNode insertAtEnd(ListNode node, int input) {

        ListNode currentNode = node;

        ListNode newNode = new ListNode(input);
        newNode.next = null;

        if(currentNode == null) {
            return newNode;
        }

        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;

        return node;
    }
}
