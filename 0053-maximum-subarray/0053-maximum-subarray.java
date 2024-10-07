class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=0;
        int maxnum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp=currentsum+nums[i];
            if(temp<nums[i]){
                currentsum=nums[i];
            }
            else{
                currentsum=temp;
            }
            if(maxnum<currentsum){
                maxnum=currentsum;
            }

        }
        return maxnum;
    }
}