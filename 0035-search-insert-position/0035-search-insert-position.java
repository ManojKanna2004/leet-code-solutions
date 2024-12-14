class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        if(target>nums[n-1]){
            return(n);
        }
        for (int i =0; i<nums.length;i++){
         if (nums[i]>=target){
            return i;
         }
        }
        return 0;
    }
}