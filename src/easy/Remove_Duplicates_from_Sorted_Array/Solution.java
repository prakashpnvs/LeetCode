package easy.Remove_Duplicates_from_Sorted_Array;

import java.util.SortedSet;
import java.util.TreeSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        int                index = 0;
        SortedSet<Integer> set   = new TreeSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        for (int element : set) {
            nums[index++] = element;
        }

        return set.size();
    }
}
