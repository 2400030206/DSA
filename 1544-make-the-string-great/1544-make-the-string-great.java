class Solution {
    public String makeGood(String s) {
        int n=s.length();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<n;i++){
             if (!stack.isEmpty() &&
                                                              
                Character.toLowerCase(stack.peek()) == Character.toLowerCase(s.charAt(i)) &&
                                           
                Character.isUpperCase(stack.peek()) != Character.isUpperCase(s.charAt(i))){
               stack.pop();
             }
             else{
               stack.push(s.charAt(i));
             }
        }
             StringBuilder sb=new StringBuilder();
             for(char ch:stack){
                sb.append(ch);
             }
        return sb.toString();

    }
}