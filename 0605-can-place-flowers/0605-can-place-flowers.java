class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            int prev=3,next=3;
            if(flowerbed[i]==0){
                if(i==0){
                    prev=0;
                }
                else{
                    prev=flowerbed[i-1];
                }
                if(i==flowerbed.length-1){
                    next=0;
                }
                else{
                    next=flowerbed[i+1];
                }
                if(next==0 && prev==0){
                    flowerbed[i]=1;
                    count++;
                }
            }
        }System.out.print(count);
        if(count>=n){
            return true;
            
        }
        return false;

        
    }
}