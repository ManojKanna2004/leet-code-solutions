class Solution {
    public boolean isValid(String s) {
        
        
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
        return sh.isEmpty();
        
        
        
    
    }
}