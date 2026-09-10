class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Arrays.fill(ans,0);
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&temperatures[s.peek()]<temperatures[i]){
              int id=  s.pop();
           
                ans[id]=i-id;
            }
            s.push(i);
        }
        return ans;
    }
}