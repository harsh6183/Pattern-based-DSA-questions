class Solution {
    public int firstUniqueEven(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
           if(nums[i]%2!=0) continue;

            boolean flag=true;

            for(int j=0; j<n;j++){
                if(i!=j && nums[i]==nums[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
            return nums[i];
             }
        }
        
        return -1;
    }
}
