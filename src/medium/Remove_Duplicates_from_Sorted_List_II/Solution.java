package medium.Remove_Duplicates_from_Sorted_List_II;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();

        ListNode currentNode = head;
        ListNode resultNode = null;

        while(currentNode != null) {
            if(!set.isEmpty() && set.contains(currentNode.val)) {
                duplicateSet.add(currentNode.val);
            }
            set.add(currentNode.val);
            currentNode = currentNode.next;
        }


        for(int element : set) {
            if(!duplicateSet.contains(element)) {
                resultNode = insertAtEnd(resultNode, element);
            }
        }

        return resultNode;
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
}
