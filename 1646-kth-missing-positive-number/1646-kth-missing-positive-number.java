class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int max=arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            a.put(i,arr[i]);

        }
        int c=0;
        for(int i=1;i<max;i++){
            if(!a.containsValue(i)){
                c++;
            }       
            if(c==k){
                return i;
            }
        }
        return max+k-c;
    }
}