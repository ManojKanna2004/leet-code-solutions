class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; ++i){
            int temp = nums[i];
            int tempo = nums[i-1];
            if (temp == tempo)
            return temp;
            
        }
        return -1;

        
    }
}