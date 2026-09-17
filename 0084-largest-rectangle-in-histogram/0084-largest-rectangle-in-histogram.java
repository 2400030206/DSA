class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer>s=new Stack<>();
        int max=0;
        for(int i=0;i<=n;i++){
         int h=i==n?0:heights[i];
         while(!s.isEmpty()&&h<heights[s.peek()]){
            int heg=heights[s.pop()];
            int width=s.isEmpty()?i:i-s.peek()-1;
            int area=heg*width;
            max=Math.max(max,area);
         }
         s.push(i);
        }
        return max;
    }
}