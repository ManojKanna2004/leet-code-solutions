class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=1, count=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]>nums[j-1]){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=1;
            }
        }
        System.out.print(count);
        return Math.max(max,count);
        
       
    }
}
