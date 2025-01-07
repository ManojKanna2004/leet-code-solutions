class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=score.length;
        for(int i=0;i<n;i++)
        {
            map.put(score[i],i);
        }
        Arrays.sort(score);
        String []ans=new String[n];
        for(int i=0;i<n;i++)
        {
            if(i==n-1)
            {
                ans[map.get(score[i])]="Gold Medal";
            }
            else if(n-2>=0 && i==n-2)
            {
                ans[map.get(score[i])]="Silver Medal";
            }
            else if(n-3>=0 && i==n-3)
            {
                ans[map.get(score[i])]="Bronze Medal";
            }
            else
            {
                ans[map.get(score[i])]=Integer.toString(n-i);
            }
        }
        return ans;
    }
}