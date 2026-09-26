class Solution {
    public int longestValidParentheses(String s) {
        int  n=s.length();
        Stack<Integer>stack=new Stack<>();
        int x=0;
        int max=0;
        stack.push(-1);
        for(int i=0;i<n;i++){
            if(s.charAt(i)==')'){
                stack.pop();
            
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    max=Math.max(max,i-stack.peek());
                }
            }
            else{
                stack.push(i);
            }
           
        }
        return max;
    }
}