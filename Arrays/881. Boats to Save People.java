class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //Greedy and sorting approach
        Arrays.sort(people);

        int boats=0;
        int left=0;
        int right=people.length-1;

        while(left<=right){

            //If heaviest and lightest person can fit in the same boat
            if(people[left]+people[right]<=limit){
                left++;
            }

            //In any case, the heaviest person will be on the boat
            right--;

            //Incrementing the number of boats
            boats++;
        }
        return boats;
    }
}
