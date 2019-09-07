package medium.Add_Two_Numbers_II;

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

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        ListNode resultNode = null;

        int carry = 0;

        while(l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while(l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        while(!stack1.isEmpty() || !stack2.isEmpty() || carry>0) {
            if(stack1.isEmpty()) {
                stack1.push(0);
            }

            if(stack2.isEmpty()) {
                stack2.push(0);
            }


            int value = stack1.pop() + stack2.pop() + carry;
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
