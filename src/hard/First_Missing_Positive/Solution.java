package hard.First_Missing_Positive;

import java.util.SortedSet;
import java.util.TreeSet;

class Solution {
    public int firstMissingPositive(int[] nums) {

        SortedSet<Integer> set = new TreeSet<>();

        for(int i=1; i<=nums.length + 1; i++) {
            set.add(i);
        }

        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            }
        }

        return set.iterator().next();
    }
}
