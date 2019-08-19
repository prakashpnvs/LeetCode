package easy.Palindrome_Linked_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        int size = 0;
        int index = 0;

        ListNode currentNode = head;

        while(currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }

        int[] arr = new int[size];

        while(head != null) {
            arr[index] = head.val;
                         head = head.next;
            index++;
        }


        int n = size-1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr[n]) {
                return false;
            }
            n--;
        }

        return true;

    }
}
