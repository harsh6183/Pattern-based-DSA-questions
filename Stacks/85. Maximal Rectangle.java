class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        //If there are no rows then return 
        if(matrix.length==0){
            return 0;
        }
        //find the number of columns in a row.
        int heights[]= new int[matrix[0].length];
        int largest =0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int val=matrix[i][j]-'0';//char to int
                if(val==0){
                    heights[j]=0;
                }else{
                    heights[j]+=val;
                }
            }
            int maxArea = largestRectangleArea(heights);
            if(largest<maxArea){
                largest=maxArea;
            }
        }
        return largest;
    }
   
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> stack = new Stack<>();
        int n = heights.length;
        int area= Integer.MIN_VALUE;

        for (int i = 0; i<=n; i++){
            int element = (i==n)?0 : heights[i];
            while(!stack.isEmpty()&& heights[stack.peek()]>element){
                int h = heights[stack.pop()];
                int previous= (stack.isEmpty())?-1: stack.peek();
                int width = i-previous-1;
                area= Math.max(area,h*width);
            }
            stack.push(i);
        } return (area==Integer.MIN_VALUE)?0:area;
    }
}
