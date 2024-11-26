class Solution {
    public int majorityElement(int[] nums) {
        int maxnum=nums[0];
        Arrays.sort(nums);
        int c=0;
        int max=0; 
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
            }else{
                c=0;
            }if(c>max){
                max=c;
                maxnum=nums[i];
            }
        }return maxnum;
    }
}