package easy.Largest_Unique_Number;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution {
    public int largestUniqueNumber(int[] A) {
        SortedSet<Integer> set          = new TreeSet<>(Collections.reverseOrder());
        SortedSet<Integer> duplicateSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            if (!set.contains(A[i])) {
                set.add(A[i]);
            } else {
                set.remove(A[i]);
                duplicateSet.add(A[i]);
            }
        }

        for (int element : duplicateSet) {
            if (set.contains(element)) {
                set.remove(element);
            }
        }

        if (!set.isEmpty()) {
            return set.iterator().next();
        } else {
            return -1;
        }

    }
}
