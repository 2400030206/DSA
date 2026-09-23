class Solution {
    public boolean backspaceCompare(String s, String t) {
          return build(s).equals(build(t));
    }
        public String build(String s){
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!st.empty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    
    }
}