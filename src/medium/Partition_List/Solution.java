package medium.Partition_List;

/* Solution 1: Using Stacks */
class Solution {
    public ListNode partition(ListNode head, int x) {

        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();

        ListNode currentNode = head;
        ListNode resultNode = null;

        while(currentNode != null) {
            if(currentNode.val < x) {
                first.push(currentNode.val);
            } else {
                second.push(currentNode.val);
            }

            currentNode = currentNode.next;
        }

        while(!second.isEmpty()) {
            resultNode = insertAtHead(resultNode, second.pop());
        }

        while(!first.isEmpty()) {
            resultNode = insertAtHead(resultNode, first.pop());
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

/* Solution 2: Using additional Linked Lists */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode first = null;
        ListNode second = null;
        ListNode currentNode = head;

        while(currentNode != null) {
            if(currentNode.val < x) {
                first = insertAtEnd(first, currentNode.val);
            } else {
                second = insertAtEnd(second, currentNode.val);
            }
            currentNode = currentNode.next;
        }

        first = insertNodeAtEnd(first, second);

        return first;

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

    public ListNode insertNodeAtEnd(ListNode node, ListNode target) {

        if(node == null) {
            return target;
        }

        ListNode currentNode = node;

        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = target;
        return node;
    }
}
