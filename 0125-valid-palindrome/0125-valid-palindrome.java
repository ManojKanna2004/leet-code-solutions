class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder sh=new StringBuilder();
       for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
            sh.append(s.charAt(i));
            }
       }
        

       String str1=sh.toString().toLowerCase();
       String str2=sh.reverse().toString().toLowerCase();;


       if(str1.equals (str2)){
        return true;
       }


        return false;
    }
}