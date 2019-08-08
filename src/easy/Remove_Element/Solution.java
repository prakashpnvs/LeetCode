package easy.Remove_Element;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int index = 0;
        for(int i=0; i<nums.length; i++) {
            if (nums[i] == val) {
                count++;
                continue;
            }
            nums[index++] = nums[i];
        }
        return nums.length - count;
    }
}
