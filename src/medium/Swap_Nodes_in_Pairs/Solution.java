package medium.Swap_Nodes_in_Pairs;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {

        ListNode currentNode = head;
        ListNode resultNode = null;

        while(currentNode != null && currentNode.next != null) {
            resultNode = insertAtEnd(resultNode, currentNode.next.val, currentNode.val);
            currentNode = currentNode.next.next;
        }

        if(currentNode != null) {
            resultNode = insertLast(resultNode, currentNode.val);
        }

        return resultNode;
    }

    public ListNode insertAtEnd(ListNode node, int value, int nextValue) {

        ListNode newNode = new ListNode(value);
        ListNode nextNode = new ListNode(nextValue);

        newNode.next = nextNode;

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

    public ListNode insertLast(ListNode node, int value) {

        ListNode newNode = new ListNode(value);
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
