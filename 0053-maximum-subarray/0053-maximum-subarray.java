class Solution {
    public int maxSubArray(int[] nums) {
     int curmax= nums[0];
     int overallmax=nums[0];
     for(int i=1;i<nums.length;i++){
        curmax=Math.max(nums[i],curmax+nums[i]);
        overallmax= Math.max(curmax,overallmax);
     }
     return overallmax;   
    }
}