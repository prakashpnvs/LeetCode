package easy.Armstrong_Number;

class Solution {
    public boolean isArmstrong(int N) {

        int num = 0;
        int sum = 0;
        int copy = N;
        int power = (int)(Math.log10(N)+1);

        while(N>0) {

            num = N % 10;

            sum += Math.pow(num, power);

            N = N / 10;

        }

        if(sum == copy) {
            return true;
        }

        return false;

    }
}
