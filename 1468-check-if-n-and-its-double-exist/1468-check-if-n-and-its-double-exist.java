class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]*2 || arr[j]==arr[i]*2)
                return true;
            }
        }
        return false;
        
    }
}