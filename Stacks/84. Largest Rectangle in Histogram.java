class Solution {
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
