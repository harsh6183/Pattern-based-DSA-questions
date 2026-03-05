class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left =0;
        int right =arr.length-k;

        while(left<right){
            int mid = left + (right-left)/2;

            //x - arr[mid] = 3 - 1 = 2
            //arr[mid+k] - x = arr[4] - 3 = 5 - 3 = 2
            //2 > 2 → false
            if(x-arr[mid]> (arr[mid+k])-x){//right side elements are closer
                left=mid+1;
            }else{
                right=mid;//Else move left.
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int i =left; i<left+k; i++){
            result.add(arr[i]);
        }
        return result;
    }
}
