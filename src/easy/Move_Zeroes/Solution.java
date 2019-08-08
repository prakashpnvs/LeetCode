package easy.Move_Zeroes;

class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                count++;
            }
        }
        for (int k = 0; k <= count; k++) {
            for (int i = 0; i < nums.length - 1; i++) {
                int head = nums[i];
                int tail = nums[i + 1];
                if (nums[i] == 0) {
                    nums[i]     = tail;
                    nums[i + 1] = head;
                }
            }
        }
    }
}
