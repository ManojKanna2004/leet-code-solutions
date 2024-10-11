class Solution {
    public boolean validMountainArray(int[] arr) {
      if(arr.length<3)
      return false;

      int i=0;
      while(i<arr.length-1 && arr[i] <arr[i+1]){
        i++;
      }  
      if(i==0 || i==arr.length-1){
        return false;
      }
      while(i<arr.length-1 && arr[i]>arr[i+1]){
        i++;
      }
      return (i== arr.length-1);
    }
}