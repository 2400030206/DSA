class Solution {
    public int smallestIndex(int[] nums) {
        int ans=-1;
       for(int i=0;i<nums.length;i++){
        int n=nums[i];
           int sum=0;
        while(n!=0){     
        int r=n%10;
         sum=sum+r; 
        n=n/10;
        }
        if(sum==i){
            ans=i;
          break;
        }
        
       } 
       return ans;
    }
}