class Solution {
    public int countKDifference(int[] nums, int k) {
        int i=0,count=0; 
         
        while (i <nums.length) {
            for (int j = 0; j < nums.length; j++) {
                if(i!=j) { 
                    int temp=nums[i]-nums[j]; 
                    if (temp==k) { 
                        count++; 
                    }
                }
            }
            i++; 
        }
        
        return count; 
    }
}