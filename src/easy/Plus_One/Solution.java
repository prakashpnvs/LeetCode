package easy.Plus_One;

class Solution {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length-1;
        for(int i=lastIndex; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i] = digits[i] + 1;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if(digits[0] == 0) {
            int[] digitsNew = new int[digits.length + 1];
            digitsNew[0] = 1;
            int j =1;
            while(j < digitsNew.length) {
                digitsNew[j] = 0;
                j++;
            }
            return digitsNew;
        }

        return digits;
    }
}
