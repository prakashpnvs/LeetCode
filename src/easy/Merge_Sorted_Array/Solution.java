package easy.Merge_Sorted_Array;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m+n];
        for(int i=0; i<m; i++) {
            result[i] = nums1[i];
        }

        for(int i=0; i<n; i++) {
            result[m++] = nums2[i];
        }

        Arrays.sort(result);

        for(int i=0; i<result.length; i++) {
            nums1[i] = result[i];
        }

    }
}
