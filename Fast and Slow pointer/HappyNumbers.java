class Solution {
     public int sumOfSquareOfDigit(int n){
            int sum =0;

            //suppose n =36
            //36%10-> 6; and 36/10=3;
            //6->36;    and 3->9;
            //sum = 45
            while(n>0){
                int digit = n%10;
                sum = sum +(digit*digit);
                n=n/10;
            }
            return sum;
        }
    public boolean isHappy(int n) {
        int fast=n;
        int slow =n;
       while(fast!=1){
        slow = sumOfSquareOfDigit(slow);
        fast=sumOfSquareOfDigit(sumOfSquareOfDigit(fast));

        if(fast==1){
            return true;
        }
        if(slow==fast){
            return false;
        }
       }
       return true;
    }
}
