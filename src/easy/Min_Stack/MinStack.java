package easy.Min_Stack;

class MinStack {

    /** initialize your data structure here. */
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    ListNode head = null;
    int min = Integer.MAX_VALUE;

    public MinStack() {

    }

    public void push(int x) {
        ListNode newNode = new ListNode(x);
        newNode.next = head;
        head = newNode;
        if(x <= min) {
            min = x;
        }
    }

    public void pop() {
        int topVal = head.val;
        head = head.next;

        /* recalculate the min value if the head val is equal to min when pop is called */
        if(min == topVal){
            min = Integer.MAX_VALUE;
            ListNode currentNode = head;
            while(currentNode != null) {
                if(currentNode.val <= min) {
                    min = currentNode.val;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
