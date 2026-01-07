class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int reqNum= target-nums[i];
            
            if(map.containsKey(reqNum)){
                int[] arr = {map.get(reqNum),i};
                return arr;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
