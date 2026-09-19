class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n;i++){
           String token=tokens[i];
            if(token.equals("+"))
            {
              int a=s.pop();
               int   b=s.pop();
               int ans =a+b;
               s.push(ans);
            }
           else if(token.equals("-"))
            {
              int   a=s.pop();
              int b=s.pop();
              int ans =b-a;
               s.push(ans);
            }
            else if(token.equals("*"))
            {
              int a=s.pop();
              int b=s.pop();
              int ans =a*b;
               s.push(ans);
            }
            else if(token.equals("/"))
            {
               int a=s.pop();
               int b=s.pop();
               int ans =b/a;
                s.push(ans);
            }
            else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }
}