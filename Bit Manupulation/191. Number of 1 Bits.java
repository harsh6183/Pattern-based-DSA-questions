class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        //Brian Kernighan’s Algorithm
        //n = 13...13 = 1101
        //Iteration 1 => n = 1101 (13)
                        //n-1 = 1100 (12)
                        //n & (n-1) = 1101 & 1100 = 1100 ...count=1
        //Iteration 2 => n = 1100 (12)
                        //n-1 = 1011 (11)
                        //1100 & 1011 = 1000 ....count=2
         //Iteration 3 => n = 1000 (8)
                        //n-1 = 0111 (7)
                        //1000 & 0111=0000... count =3               

        while(n != 0){
            n = n & (n-1); //This is to remove the right most 1
            count++;
        }
        return count;
    }
}
