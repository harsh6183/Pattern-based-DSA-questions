class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);

        int n = happiness.length;
        long sum =0; // The error was coming because instead of long i had taken int 
        int turn =0; //To minus the (-1) according to turns
        for(int i=n-1;i>=0;i--){
            sum=sum+Math.max(happiness[i]-turn,0); //If 0-1 condition comes then take 0
            turn++;
            if(turn>=k) break;
        }
        return sum;
    }
}
