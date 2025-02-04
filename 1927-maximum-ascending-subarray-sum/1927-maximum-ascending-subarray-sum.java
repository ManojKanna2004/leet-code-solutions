class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0,curr=0;   
             
        for(int i=1;i<nums.length;i++){
            int f=0;
            if(nums[i]>nums[i-1]){
                curr+=nums[i-1];
            }
            else{
                curr+=nums[i-1];
               f=1;
            }            
            max=Math.max(curr,max);
            if(f==1){
                curr=0;
            }
        }
        if(nums[nums.length-1]+curr>max){
            max=nums[nums.length-1]+curr;
        }
        return max;
    }
}