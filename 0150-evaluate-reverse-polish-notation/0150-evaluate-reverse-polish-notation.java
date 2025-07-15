class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st=new Stack<>();

        for( String i:tokens){
            if(i.length()>1 ||Character.isDigit(i.charAt(0)))
             st.push(Integer.parseInt(i));
             else{
                int y=1;
                int x=1;

                if(!st.isEmpty())
                    y=st.pop();
                if(!st.isEmpty())
                    x=st.pop();
                if(i.equals("+"))
                    st.push(x+y);
                if(i.equals("-"))
                    st.push(x-y);
                if(i.equals("*"))
                    st.push(x*y);
                if(i.equals("/"))
                    st.push(x/y);
                    }
        }
        return st.pop();

        
        
        
    }
}