package medium.Sort_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {

        ListNode resultNode = null;

        while(head != null) {
            resultNode = insertAfter(resultNode, head.val);
            head = head.next;
        }

        return resultNode;

    }

    public ListNode insertAfter(ListNode node, int value) {

        ListNode newNode = new ListNode(value);
        newNode.next = null;

        if(node == null) {
            return newNode;
        }

        if(value <= node.val) {
            newNode.next = node;
            return newNode;
        }

        ListNode currentNode = node;

        while(currentNode != null) {
            if(currentNode.next == null) {
                currentNode.next = newNode;
                return node;
            }
            if(value >= currentNode.val && value <= currentNode.next.val) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return node;
            } else {
                currentNode = currentNode.next;
            }
        }

        return node;

    }
}
