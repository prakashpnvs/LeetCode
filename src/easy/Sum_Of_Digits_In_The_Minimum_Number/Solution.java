package easy.Sum_Of_Digits_In_The_Minimum_Number;

class Solution {
    public int sumOfDigits(int[] A) {
        int minimum = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < minimum) {
                minimum = A[i];
            }
        }

        int m      = minimum;
        int n, sum = 0;
        while (m > 0) {
            n   = m % 10;
            sum = sum + n;
            m   = m / 10;
        }

        if (sum % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
