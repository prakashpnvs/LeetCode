package hard.Median_Of_Two_Sorted_Arrays;

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int      index        = 0;
        int      resultLength = nums1.length + nums2.length;
        double[] result       = new double[resultLength];

        for (int i = 0; i < nums1.length; i++) {
            result[index] = nums1[i];
            index++;
        }

        for (int i = 0; i < nums2.length; i++) {
            result[index] = nums2[i];
            index++;
        }

        Arrays.sort(result);

        if (result.length % 2 != 0) {
            return result[(result.length - 1) / 2];
        } else {
            return (result[(result.length) / 2] + result[((result.length) / 2) - 1]) / 2;
        }
    }

}


