class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max[]=new int[n];
        int mini[]=new int[n];
        max[0]=nums[0];
        mini[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            max[i]=Math.max(max[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
           mini[i]=Math.min(mini[i+1],nums[i]);
        }

        for(int i=0;i<n;i++){
           if(max[i]-mini[i]<=k){
            return i;
           }
        }
        return -1;
    }
}
