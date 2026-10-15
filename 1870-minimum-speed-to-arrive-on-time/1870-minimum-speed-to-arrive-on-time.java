class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
       if (hour <= dist.length - 1) {
       return -1;
      }
     int high = 10000000;
        for(int i=0;i<dist.length;i++){
            high=Math.max(high,dist[i]);
        }
        int low=1;
       int  ans=-1;
       
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(dist,mid,hour)){
                ans=mid;
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean possible(int[] a,int mid,double h){
        double c=0;
        for(int i=0;i<a.length-1;i++){
            c+=Math.ceil((double)a[i]/mid);
        }
   c+=(double)a[a.length-1]/mid;
        return c<=h;
    }

}