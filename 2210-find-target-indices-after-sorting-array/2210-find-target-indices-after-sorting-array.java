class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
           if(nums[i]==target)
           {
            //System.out.println(i);
               list.add(i);
           }
        }
        return list;
    }
}