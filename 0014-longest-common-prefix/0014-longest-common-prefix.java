class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length ==0 || strs== null){
            return "";
        }
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        int i=0;
        while (i<first.length() && i<last.length() && first.charAt(i) == last.charAt(i)){
                i++;
            
        }
        String prefix = first.substring(0,i);


        
        return prefix;
        
    }
}