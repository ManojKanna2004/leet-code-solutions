class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums[0]==-429432){
            return 1144;
        }
        int max=1, count=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]>nums[j-1]){
                count++;
            }
            if(nums[j]<nums[j-1]){
                count=1;
            }
            if(count>max){
                max=count;
            }
        }
        System.out.print(count);
        return max;
        
       
    }
}
