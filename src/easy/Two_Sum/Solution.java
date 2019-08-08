package easy.Two_Sum;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i==j){
                    continue;
                }else{
                    if(nums[i] + nums[j] == target){
                        output[0] = i;
                        output[1] = j;
                        return output;
                    }
                }
            }
        }
        return output;
    }

    public static void main(String[] args){
        int[] inputArr = {2, 7, 11, 15};
        Solution sol = new Solution();
        sol.twoSum(inputArr, 9);
    }
}
