package easy.Missing_Number;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<=nums.length; i++) {
            set.add(i);
        }

        for(int i = 0; i<nums.length; i++) {
            set.remove(nums[i]);
        }

        return set.iterator().next();

    }
}
