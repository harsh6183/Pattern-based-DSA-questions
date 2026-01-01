class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*for(int i=0;i<numbers.length;i++){
            for (int j=i;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[0];   
         */

        int left = 0;
        int right= numbers.length-1;

        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }else{
                break;
            }
        }
        return new int[]{left+1, right+1};
    }
}
