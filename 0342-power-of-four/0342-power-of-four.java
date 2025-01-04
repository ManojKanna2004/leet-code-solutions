class Solution {
    public boolean isPowerOfFour(int n) {
        int k=0;
        if(n<=0){
            return false;
        }
        else if(n==1){
            return true;
        }
        else{
            for(int i=0;n!=1;i++){
                k=k+n%4;
                n=n/4;
                 if(k!=0){
                return false;
            }
            }
           if(k==0){
            return true;
           }
           else{
            return false;
           }
          
        }
    }
}