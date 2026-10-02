class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
        while(!stack.isEmpty()&&k!=0&&stack.peek()>ch){
            stack.pop();
            k--;
        }
        stack.push(ch);
        }

        while(k!=0){              //1 2 3 4 5
            stack.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
      int i=0;
      while(i<sb.length()&&sb.charAt(i)=='0'){
        i++;
      }
       if (i == sb.length()) {
            return "0";
        }
      return sb.substring(i);
    }
}