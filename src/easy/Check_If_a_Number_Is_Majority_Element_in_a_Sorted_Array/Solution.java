package easy.Check_If_a_Number_Is_Majority_Element_in_a_Sorted_Array;

class Solution {
    public boolean isMajorityElement(int[] nums, int target) {

        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                count = count + 1;
            }
        }

        return count > nums.length/2 ? true : false;
    }
}
