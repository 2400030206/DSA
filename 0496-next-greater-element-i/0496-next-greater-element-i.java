class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int idx=0;
            for(int k=0;k<nums2.length;k++){
                if(nums1[i]==nums2[k]){
                   idx=k;
                }
            }
            int r=-1;
            for(int j=idx+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    r=nums2[j];
                    break;
                }
            }
            ans[i]=r;

            }
             return ans;
        }
       
    }