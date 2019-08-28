package hard.Merge_k_Sorted_Lists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        List<Integer> mergedList = new ArrayList<>();

        for(int i=0; i<lists.length; i++) {
            while(lists[i] != null) {
                mergedList.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }

        Collections.sort(mergedList);

        ListNode resultNode = null;
        for(int value : mergedList) {
            resultNode = insertAtEnd(resultNode, value);
        }

        return resultNode;

    }


    public ListNode insertAtEnd(ListNode node, int input) {

        ListNode currentNode = node;

        ListNode newNode = new ListNode(input);
        newNode.next = null;

        if(currentNode == null) {
            return newNode;
        }

        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;

        return node;
    }

}
