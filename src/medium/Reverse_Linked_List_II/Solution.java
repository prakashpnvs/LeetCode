package medium.Reverse_Linked_List_II;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode currentNode = head;
        ListNode resultNode = null;

        int count = 1;

        while(currentNode != null && count < m) {
            resultNode = insertAtEnd(resultNode, currentNode.val);
            count++;
            currentNode = currentNode.next;
        }

        ListNode reversedNode = null;
        while(currentNode != null && count >= m && count <=n) {
            reversedNode = insertAtHead(reversedNode, currentNode.val);
            count++;
            currentNode = currentNode.next;
        }

        resultNode = insertNodeAtEnd(resultNode, reversedNode);

        while(currentNode != null) {
            resultNode = insertAtEnd(resultNode, currentNode.val);
            currentNode = currentNode.next;
        }

        return resultNode;
    }

    public ListNode insertAtHead(ListNode node, int value) {

        ListNode newNode = new ListNode(value);

        if(node == null) {
            return newNode;
        }

        newNode.next = node;
        return newNode;

    }

    public ListNode insertAtEnd(ListNode node, int value) {

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

    public ListNode insertNodeAtEnd(ListNode node, ListNode target) {
        if(node == null) {
            return target;
        } else if (target == null) {
            return node;
        }

        ListNode currentNode = node;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = target;
        return node;
    }

}
