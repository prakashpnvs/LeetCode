package medium.Insertion_Sort_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {

        ListNode currentNode = head;
        ListNode resultNode = null;
        int size = 0;

        while(currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }

        int[] arr = new int[size];

        currentNode = head;
        int pos = 0;

        while(currentNode != null) {
            arr[pos++] = currentNode.val;
                         currentNode = currentNode.next;
        }

        for(int i=0; i<arr.length; i++) {
            int temp = arr[i];
            int index = i;

            while(index > 0 && arr[index-1] > temp) {
                arr[index] = arr[index-1];
                index--;
            }

            arr[index] = temp;
        }

        for(int i=arr.length-1; i>=0 ; i--) {
            resultNode = insertAtHead(resultNode, arr[i]);
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

}
