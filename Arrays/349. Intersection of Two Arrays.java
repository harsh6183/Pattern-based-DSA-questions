class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        //Time complexity O(n+m)
        HashSet <Integer> set = new HashSet<>();
       for(int num:nums1){
        set.add(num);
       }
        
        HashSet<Integer> result= new HashSet<>();
        for(int num2: nums2){
            if(set.contains(num2)){
                result.add(num2);
            }
        }

        int arr[] = new int[result.size()];
        int i=0;
        for(int num: result){
            arr[i++]=num;
        }
        return arr;
    }
}
