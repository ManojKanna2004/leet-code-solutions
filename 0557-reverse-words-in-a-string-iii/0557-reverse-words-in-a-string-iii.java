class Solution {

    static String reverse(StringBuilder s){
        return s.reverse().toString();
    }
    public String reverseWords(String s) {
        String arr[] = s.split(" ");

        int n = arr.length;

        StringBuilder ans = new StringBuilder("");

        for(int i=0; i<n; i++){
            StringBuilder x = new StringBuilder(arr[i]);
            ans.append(reverse(x));

            if(i!=n-1) ans.append(" ");
        }
        return ans.toString();
    }
}