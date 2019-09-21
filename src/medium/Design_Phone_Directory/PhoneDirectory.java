package medium.Design_Phone_Directory;

class PhoneDirectory {

    /** Initialize your data structure here
     @param maxNumbers - The maximum numbers that can be stored in the phone directory. */

    ListNode node = null;

    public PhoneDirectory(int maxNumbers) {
        for(int i=maxNumbers-1; i>=0; i--) {
            ListNode newNode = new ListNode(i);
            newNode.next = node;
            node = newNode;
        }
    }

    /** Provide a number which is not assigned to anyone.
     @return - Return an available number. Return -1 if none is available. */
    public int get() {
        int num = -1;
        if(node != null) {
            num = node.val;
            node = node.next;
        }
        return num;
    }

    /** Check if a number is available or not. */
    public boolean check(int number) {
        ListNode currentNode = node;
        while(currentNode != null) {
            if(currentNode.val == number) {
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    /** Recycle or release a number. */
    public void release(int number) {
        ListNode currentNode = node;
        while(currentNode != null) {
            if(number == currentNode.val) {
                return;
            }
            currentNode = currentNode.next;
        }
        ListNode restoreNode = new ListNode(number);
        restoreNode.next = node;
        node = restoreNode;
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */
