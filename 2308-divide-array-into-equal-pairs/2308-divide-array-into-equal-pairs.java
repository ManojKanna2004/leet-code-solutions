class Solution {
    public boolean divideArray(int[] nums) {
        int a[] = new int[501];
        for(int i:nums) a[i]++;
        for(int i:a) if(i%2!=0) return false;
        return true;
    }
}