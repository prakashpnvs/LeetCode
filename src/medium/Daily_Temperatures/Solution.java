package medium.Daily_Temperatures;

class Solution {
    public int[] dailyTemperatures(int[] T) {

        int[] result = new int[T.length];
        for(int i=0; i<T.length; i++) {
            int count = 0;
            for(int j=i+1; j<T.length; j++) {
                count++;
                if(T[j] > T[i]) {
                    result[i] = count;
                    break;
                }
            }
        }

        return result;
    }
}
