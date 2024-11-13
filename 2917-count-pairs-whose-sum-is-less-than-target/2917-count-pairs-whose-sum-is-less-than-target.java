class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int[] n=new int[nums.size()];
        for (int i = 0; i < nums.size(); i++)
            n[i] = nums.get(i);
        int k=0;
        for(int i=0;i<n.length;i++)
            for(int j=i+1;j<n.length;j++)
                if(n[i]+n[j]<target)    k++;
        return k;
    }
}