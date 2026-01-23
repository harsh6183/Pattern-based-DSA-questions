class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count =0;

            //Time complexity O(n^2) 
            //Space complexity O(1)
        for(int i=0;i<intervals.length;i++){
            int c = intervals[i][0];  //Interval 1st point
            int d = intervals[i][1];  //Interval 2nd point

            boolean isCovered =false;
            for(int j =0;j<intervals.length;j++){
                int a = intervals[j][0]; //Interval 1st Point
                int b = intervals[j][1]; //Interval 2nd point

                if(i!=j && (a<=c && b>=d)){
                    isCovered =true;
                    break;
                }
            }

            if(!isCovered){
                count= count+1;
            }
        }
        return count;
    }
}
