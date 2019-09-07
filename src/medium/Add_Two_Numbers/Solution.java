package medium.Add_Two_Numbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode resultNode = null;

        while(l1 != null || l2 != null || carry >0) {
            if(l1==null) {
                l1 = insertAtEnd(l1, 0);
            }

            if(l2==null) {
                l2 = insertAtEnd(l2, 0);
            }
            int valueOfNode = l1.val + l2.val + carry;
            carry = valueOfNode / 10;
            valueOfNode = valueOfNode % 10;
            resultNode = insertAtEnd(resultNode, valueOfNode);
            l1 = l1.next;
            l2 = l2.next;
        }

        return resultNode;
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
