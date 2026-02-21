//Greedy
class Solution {
    public int findMinArrowShots(int[][] points) {
        //Comparator
        //This is swaping basically 
        Arrays.sort(points,(a,b)-> (a[1]<=b[1])?-1:1);
        int arrows=1;
        int lastEnd = points[0][1];

        for(int point[]: points){
            if(point[0]>lastEnd){
                //If there is no overlapping point then increasing the arrow
                arrows++;
                lastEnd =point[1];
            }
        }
        return arrows;
    }
}
