class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=0;
        int total=0;
       for(int i=0;i<n;i++){
        total+=weights[i];
        max=Math.max(max,weights[i]);
       }
       int left=max;
       int right=total;
       int ans=total;
       while(left<=right){
        int mid=left+(right-left)/2;
        if(isposiable(weights, mid)>days){
           
            left=mid+1;
        }
        else{
             ans=mid;
            right=mid-1;
        }

       }
       return ans;
    }
    public static int isposiable(int[] a,int mid){
        int days=1;
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(sum+a[i]>mid){
                days++;
               sum=0;
                
            }
           
            sum+=a[i];
        }
        return days;
    }
}