class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int ans=0;;
        for(int i=1;i<=n;i++){
            ans+=(26-(s.charAt(i-1)-'a'))*i;
        }
        return ans;
    }
}