class Solution {
    public int commonFactors(int a, int b) {
        int n;
        if(a>b)
            n=b;
        else
            n=a;
        int count=0;
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0)
            count++;
        }
        return count;
    }
}