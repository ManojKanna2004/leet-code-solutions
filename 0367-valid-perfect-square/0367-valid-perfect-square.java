class Solution {
    public boolean isPerfectSquare(int num) {
         double a=Math.sqrt(num);
         if(a==(int)a)
         {
            return true;
         }
         return false;
    }
}