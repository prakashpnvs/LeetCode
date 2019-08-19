package medium.Range_Addition;

class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {

        int[] result = new int[length];

        if (length == 0 || updates.length == 0) {
            return result;
        }

        for(int k=0; k<updates.length; k++) {
            for(int i=updates[k][0]; i<=updates[k][1]; i++) {
                result[i] = result[i] + updates[k][2];
            }
        }

        return result;

    }
}
