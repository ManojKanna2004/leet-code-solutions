class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> org = new HashSet<>();
        Set<Integer> dup = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!org.contains(nums[i])){
                org.add(nums[i]);
            }
            else{
                dup.add(nums[i]);
            }
        }
        org.removeAll(dup);

        return org.iterator().next();
        }
        
    }
