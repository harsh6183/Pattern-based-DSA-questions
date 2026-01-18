class Solution {
    public int deleteAndEarn(int[] nums) {
        int include = 0;
        int exclude =0;
        int count[] = new int[10001];

        for(int val:nums)
        count[val]++;

        for(int i=0;i<=10000;i++){
            int ni=exclude+count[i]*i;
            int ne=Math.max(include,exclude);

            include =ni;
            exclude=ne;
        }
        return Math.max(include,exclude);
    }
}