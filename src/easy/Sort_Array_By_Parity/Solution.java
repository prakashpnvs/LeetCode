package easy.Sort_Array_By_Parity;

class Solution {
    public int[] sortArrayByParity(int[] A) {

        int[] result = new int[A.length];
        int first = 0;
        int last = A.length - 1;

        for(int i=0; i<A.length; i++) {
            if(A[i] % 2 == 0) {
                result[first++] = A[i];
            } else {
                result[last--] = A[i];
            }
        }

        return result;

    }
}
