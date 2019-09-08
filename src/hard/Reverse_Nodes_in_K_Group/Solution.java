package hard.Reverse_Nodes_in_K_Group;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode currentNode = head;
        ListNode resultNode = null;
        int size = 0;
        int count = 0;
        int cycles = 0;

        while(currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }

        if(k > 0){
            cycles = size / k;
        }

        currentNode = head;
        while(cycles > 0) {
            ListNode reversedNode = null;
            while(count < k) {
                reversedNode = insertAtHead(reversedNode, currentNode.val);
                count++;
                currentNode = currentNode.next;
            }

            resultNode = insertAtEnd(resultNode, reversedNode);
            cycles--;
            count = 0;
        }

        return insertAtEnd(resultNode, currentNode);
    }

    public ListNode insertAtHead(ListNode node, int target) {
        ListNode newNode = new ListNode(target);

        if(node == null) {
            return newNode;
        }
        newNode.next = node;
        return newNode;
    }

    public ListNode insertAtEnd(ListNode node, ListNode target) {
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
