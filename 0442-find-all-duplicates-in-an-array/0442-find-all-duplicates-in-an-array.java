class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> org=new HashSet<>();
        HashSet<Integer> dup=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(org.contains(nums[i])){
                dup.add(nums[i]);
            }
            else {
                org.add(nums[i]);
            }
        }
        return new ArrayList<>(dup);
    }
}