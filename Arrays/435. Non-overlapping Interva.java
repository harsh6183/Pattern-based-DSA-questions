//Greedy
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[1]-b[1]);//Sorting the array on the bases of intervals
        int n = intervals.length;
        int removed =0;
        int lastEnd = intervals[0][1];

        for(int i=1;i<n;i++){
            if(intervals[i][0]<lastEnd){  //This is basicall checking the Start is less then the end and if yes then it comes under the interval so remove that
                removed++;
            }else{
                lastEnd=intervals[i][1];
            }
        }
        return removed;
    }
}
