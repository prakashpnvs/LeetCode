package easy.Add_Digits;

class Solution {
    public int addDigits(int num) {

        int n = num;
        int x = 0;
        int sum = 0;

        while(n > 0) {
            x = n % 10;

            sum = sum + x;

            n = n/10;

            if(n==0 && sum > 9) {
                n = sum;
                sum = 0;
            }

        }

        return sum;

    }
}
