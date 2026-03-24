class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        //Time complexity 2^target
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates,0,0,target,new ArrayList<>(),result);
        return result;
    }

    //Using the backtracking 
    //Creating the helper funtion to track the record
    public void helper(int[] candidates, int index,int sum ,int target, List<Integer> arr,List<List<Integer>> list  ){

        if(sum> target) return ;
        if(sum==target){
            list.add(new ArrayList<>(arr));
            return;
        }

        for(int i=index;i<candidates.length;i++){
            arr.add(candidates[i]);
            helper(candidates,i,sum+candidates[i],target,arr,list);
            arr.remove(arr.size()-1);
        }
    }
}
