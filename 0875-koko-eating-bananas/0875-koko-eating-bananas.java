class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
       
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        } 
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
             if(canpile(piles,h,mid)){
                ans=mid;
                high=mid-1;
             }
             else{
                low=mid+1;
             }
        }
        return ans;
    }
   boolean canpile(int[] piles,int h,int mid){
    long sum=0;
    for(int pile:piles){
        sum+=((long)pile+mid-1)/mid;
    }
    return sum<=h;
   }
}