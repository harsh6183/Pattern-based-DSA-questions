class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        //Dutch National Flag Algorithm
        while (mid <= high) {
            if (nums[mid] == 0) {
                //  0s at the beginning
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // 1s stay in the middle
                mid++;
            } else {
                // nums[mid] == 2,  2s at the end
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
    //     int start =0;
    //     int end =nums.length-1;
    //     int index=0;
    //     while(index<=end){
    //         if(nums[index]==0){
    //             swap(nums,index,start);
    //             index++;
    //             start++;
    //         }else if(nums[index]==2){
    //             swap(nums,index,end);
    //             end--;
    //         }else{
    //             index++;
    //         }
    //     }

        
    // }
    // public void swap (int nums[], int i,int j){
    //         int temp = nums[i];
    //         nums[i] =nums[j];
    //         nums[j]=temp;
    //     }
}
