class Solution {
    public boolean isPowerOfFour(int n) {
        //power must be positive + power of 2
        if(n<=0 || (n &(n-1))!=0){
            return false;
        }
        //Power of 4
        return (n-1)%3==0;
    }
}
