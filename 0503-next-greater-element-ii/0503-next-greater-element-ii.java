class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer>s=new Stack<>();
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=-1;
        }
        for(int i=2*n-1;i>=0;i--){
            int num=nums[i%n];
          while(!s.isEmpty()&&s.peek()<=num){
            s.pop();
          }
          if(i<n&&!s.isEmpty()){
            ans[i]=s.peek();
          }
          s.push(num);
        }
        return ans;
    }
}