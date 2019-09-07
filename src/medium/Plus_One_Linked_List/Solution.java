package medium.Plus_One_Linked_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode plusOne(ListNode head) {

        if(head == null) {
            return head;
        }

        Stack<Integer> stack = new Stack<>();
        ListNode resultNode = null;
        int carry = 0;

        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }

        //add 1 to the number
        int value = stack.pop() + 1;
        carry = value / 10;
        value = value % 10;
        resultNode = insertAtHead(resultNode, value);

        while(!stack.isEmpty() || carry>0) {
            if(stack.isEmpty()) {
                stack.push(0);
            }

            value = stack.pop() + carry;
            carry = value / 10;
            value = value % 10;

            resultNode = insertAtHead(resultNode, value);
        }

        return resultNode;

    }

    public ListNode insertAtHead(ListNode node, int value){

        ListNode newNode = new ListNode(value);
        newNode.next = node;
        return newNode;

    }


}
