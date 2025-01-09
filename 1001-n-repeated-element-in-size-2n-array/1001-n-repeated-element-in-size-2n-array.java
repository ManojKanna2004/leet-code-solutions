class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> num= new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(num.contains(nums[i]))
                return nums[i];
                num.add(nums[i]);
        }
        return 0;
    }
}