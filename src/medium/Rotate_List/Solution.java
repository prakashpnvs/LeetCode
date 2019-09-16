package medium.Rotate_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode currentNode = head;
        int size = 0;

        while(currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }

        k = k % size;
        int index = 1;
        currentNode = head;

        while(currentNode != null) {
            ListNode nextNode = currentNode.next;
            if(index == size - k) {
                currentNode.next = null;
                head = insertAtHead(head, nextNode);
            }
            currentNode = currentNode.next;
            index++;
        }
        return head;
    }

    public ListNode insertAtHead(ListNode node, ListNode target) {
        if(node == null) {
            return target;
        }
        if(target == null) {
            return node;
        }

        ListNode currentNode = target;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        return target;
    }
}
