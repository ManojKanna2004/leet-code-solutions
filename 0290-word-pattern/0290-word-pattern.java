class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[]=s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String str=arr[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(str)){
                    return false;
                }
            }else{
                if(map.containsValue(str)){
                    return false;
                }
                map.put(ch,str);
            }
            
        }
        return true;
        

    }
}