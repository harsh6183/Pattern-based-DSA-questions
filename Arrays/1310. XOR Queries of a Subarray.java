class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]^ arr[i-1];
        }
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int leftIdx=queries[i][0];
            int rightIndx=queries[i][1];

            if(leftIdx==0){
                ans[i]=arr[rightIndx];
            }else{
                ans[i]=arr[rightIndx]^arr[leftIdx-1];
            }
        }
        return ans;
    }
}
