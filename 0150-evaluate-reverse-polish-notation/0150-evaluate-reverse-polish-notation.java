class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        String operators="+-*/";

        for(String tocken :tokens)
        {
          if(operators.indexOf(tocken)!=-1){
             int d2=st.pop();
             int d1=st.pop();
             int res=0;
             if(tocken.equals("+"))
              res=d1+d2;
             else if(tocken.equals("-"))
              res=d1-d2;
             else if(tocken.equals("*"))
             res=d1*d2;
             else if(tocken.equals("/"))
             res=d1/d2; 
             st.push(res);
           }
           else
           st.push(Integer.parseInt(tocken));

        }
        return st.peek();
    }
}