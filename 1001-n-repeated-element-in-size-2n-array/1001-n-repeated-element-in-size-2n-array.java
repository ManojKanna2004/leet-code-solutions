class Solution {
    public int repeatedNTimes(int[] a) {
        int n=a.length;
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            if(hs.contains(a[i]))
                return a[i];
            hs.add(a[i]);
        }
        return -1;
    }
}