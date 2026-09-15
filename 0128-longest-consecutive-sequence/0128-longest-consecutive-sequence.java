class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer>set=new HashSet<>();
        for(int ch:nums){
            set.add(ch);
        }
int count=0,res=0;
int lon=0;
        for(int ch:set){
            
            if(!set.contains(ch - 1)){
           int current=ch;
            count=1;
        
        while(set.contains(current+1)){
count++;
     current++;
        }
res=Math.max(res,count);

            }  
    }
    return res;
    }
}