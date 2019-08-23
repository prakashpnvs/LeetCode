package easy.Linked_List_Cycle;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        ListNode currentNode = head;
        ListNode nextNode = null;

        while(currentNode != null) {
            if(!set.isEmpty() && set.contains(currentNode.next)) {
                return true;
            } else {
                set.add(currentNode);
            }
            currentNode = currentNode.next;
        }

        return false;

    }
}
