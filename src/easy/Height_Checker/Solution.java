package easy.Height_Checker;

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {

        int[] temp = new int[heights.length];
        for(int i=0; i<heights.length; i++) {
            temp[i] = heights[i];
        }

        int count = 0;
        Arrays.sort(temp);

        for(int i=0; i<heights.length; i++) {
            if(heights[i] != temp[i]) {
                count = count + 1;
            }
        }

        return count;
    }
}
