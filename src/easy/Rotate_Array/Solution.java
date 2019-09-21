package easy.Rotate_Array;

class Solution {
    public void rotate(int[] nums, int k) {

        if(nums.length == 0 || k == 0) {
            return;
        }

        k = k % nums.length;

        int target = nums.length - k;

        ListNode node = null;

        for(int i=target-1; i>=0; i--) {
            ListNode newNode = new ListNode(nums[i]);
            newNode.next = node;
            node = newNode;
        }

        for(int i=nums.length-1; i>=target; i--) {
            ListNode newNode = new ListNode(nums[i]);
            newNode.next = node;
            node = newNode;
        }

        int index = 0;
        while(node != null) {
            nums[index++] = node.val;
                            node = node.next;
        }

    }
}