class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        //left = 5
        //right = 7
        //Range=> 5 = 101,6 = 110,7 = 111
        //Iteration 1 =>  left = 101 (5) right = 111 (7)
        //left<right => right = right & (right - 1)
                        //= 111 & 110
                        //= 110 (6)
        //Iteration 2 => left = 101 (5) right = 110 (6)
                        //right = 110 & 101  = 100 (4)
                        //Now 5<4 condition of loop fails
                        //left < right → false
        //finally => return left & right   or return only right (this is also valid)
                    //= 101 & 100
                   // = 100 (4)
        while(left<right){
            right=right & (right-1);
        }
        return left & right;
    }
}
