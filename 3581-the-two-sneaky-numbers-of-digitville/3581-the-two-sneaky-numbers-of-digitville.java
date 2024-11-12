class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        for(int num : nums){
            if (set.contains(num)){
                res[l++] = num;
                if (l == 2) break;
            } else {
                set.add(num);
            }
        }
    return res;
    }
}