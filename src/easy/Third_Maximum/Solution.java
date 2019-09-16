package easy.Third_Maximum;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {

        SortedSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for(int num : nums) {
            set.add(num);
        }

        if(set.size() < 3) {
            return set.iterator().next();
        } else {
            Integer[] maxArr = set.toArray(new Integer[set.size()]);
            return maxArr[2];
        }
    }
}
