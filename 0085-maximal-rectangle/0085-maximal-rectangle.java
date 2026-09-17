class Solution {
    public int maximalRectangle(char[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[] height=new int[c];
        int max=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]=='1'){
                    height[j]+=1;
                }
                else{
                    height[j]=0;
                }
            }
            max=Math.max(max,hist(height));
        }
      return max;
    }
        int hist(int height[]){
            int n=height.length;
            Stack<Integer>s=new Stack<>();
            int max=0;
            for(int i=0;i<=n;i++){
                int h=i==n?0:height[i];
               while(!s.isEmpty()&&h<height[s.peek()]){
              int  hei=height[s.pop()];
              int width=s.isEmpty()?i:i-s.peek()-1;
              int area=hei*width;
              max=Math.max(max,area);
               }
               s.push(i);
            }
            return max;
        }

}