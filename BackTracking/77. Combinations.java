class Solution {
         //Using Backtracking
    
    public void backtrack(List<Integer>l,int f,int n, int k,List<List<Integer>> res){
        if(l.size()==k){
            res.add(new ArrayList<>(l));
            return;
        }

        //Other number options
        //Making branches at returning the each members
        for(int i=f;i<=n;i=i+1){
            l.add(i);
            backtrack(l,i+1,n,k,res);
            l.remove(l.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res= new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        backtrack(l,1,n,k,res);
        return res;
    }
}
