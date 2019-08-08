package easy.Fixed_Point;

class Solution {
    public int fixedPoint(int[] A) {
        int result = -1;
        for (int i = 0; i < A.length; i++) {
            if (i == A[i]) {
                result = i;
                break;
            }
        }
        return result;
    }
}
