package medium.Odd_Even_Linked_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode oddNode = null;
        ListNode evenNode = null;

        boolean odd = true;

        while(head != null) {
            if(odd) {
                oddNode = insertAtEnd(oddNode, head.val);
                odd = false;
            } else {
                evenNode = insertAtEnd(evenNode, head.val);
                odd = true;
            }
            head = head.next;
        }

        ListNode currentNode = oddNode;

        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = evenNode;

        return oddNode;

    }

    public ListNode insertAtEnd(ListNode node, int value) {

        ListNode newNode = new ListNode(value);
        newNode.next = null;

        if(node == null) {
            return newNode;
        }

        ListNode currentNode = node;

        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        return node;
    }


}
