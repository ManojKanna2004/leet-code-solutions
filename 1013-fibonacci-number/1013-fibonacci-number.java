class Solution {
    public int fib(int n) {
        int[] a=new int[n+1];
        if(n<=0)return 0;
        a[0]=0;
        a[1]=1;
        return fib(n, a);
    }
    public int fib(int n,int[] dp) {
        if(n<0)return 0;
        if(dp[n]!=0)return dp[n];
        dp[n]=fib(n-1, dp)+fib(n-2, dp);
        return dp[n];
    }
}