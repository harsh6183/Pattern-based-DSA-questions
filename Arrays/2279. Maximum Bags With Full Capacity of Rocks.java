class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        //One of finest and easiest question ever solved 
        //Greedy approach

        int n = rocks.length;
        int difference[]= new int[n];

        for(int i=0;i<n;i++){
            difference[i]=capacity[i]-rocks[i];
        }

        Arrays.sort(difference);

        int count =0;
        for(int i=0;i<n;i++){
            //Basically checking the capacity and if there is difference then decrease the additional rock and finally increase the count and once the difference is zero bag is full and return the count.
            if(difference[i]<=additionalRocks){
                additionalRocks=additionalRocks-difference[i];
                difference[i]=0;
            }
            if(difference[i]==0){
                count++;
            }
        }
        return count;
    }
}
