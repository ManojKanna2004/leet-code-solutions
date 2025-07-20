class Solution {
    public boolean isValid(String s) {
        if(s.length()<2){
            return false;
        }
        Stack<Character> sh=new Stack<>();

        
        

        for(char c: s.toCharArray()){
            if(c=='('){
                sh.push(')');
            }else if(c=='['){
                sh.push(']');
            }
            else if (c=='{') {
                sh.push('}');
            }else {
            if(sh.isEmpty() || c!=sh.pop()){
                return false;
            }
            }

            
        }
        if(!sh.isEmpty())
        return false;
        
        
    return true;
    }
}