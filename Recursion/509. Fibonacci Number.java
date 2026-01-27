class Solution {
    public int fib(int n) {
        //Solving using recursion
        //Base case
        //Time comp O(2^n)
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
