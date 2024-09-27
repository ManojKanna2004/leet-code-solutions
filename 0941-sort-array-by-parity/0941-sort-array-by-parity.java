class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n = arr.length;
        int i=0; 
        
        for(int j=0; j<n; j++){
            if(arr[j]%2==0){
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
                i++;
            }
        }
        return arr;
    }
}