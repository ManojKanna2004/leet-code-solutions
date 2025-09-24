class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map  = new HashSet<>();
        for(int i:nums){
            if(!map.contains(i)){
                map.add(i);
            }
            else{
                return true;
            }
        } 
        return false;
    }
}