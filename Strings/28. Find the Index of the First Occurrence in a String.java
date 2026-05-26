class Solution {
    public int strStr(String haystack, String needle) {
       int n = haystack.length();
       int m = needle.length();
        //i=n-m //sadbustsad sad =9-3=6
        //i goes from 0 to 6
       for(int i =0; i<=n-m;i++){
        int j =0;
        while(j<m && haystack.charAt(i+j) == needle.charAt(j)){
            j++;  //i+j = 0+0 =0 and j=0 / i=s & j=s matches move j++ now j at 1
                  //i+j = 0+1 =1 and j=1 / i=a & j=a matches move j++ now j at 2
                  //i+j = 0+2 =2 and j=2 / i=d & j=d matches move j++ now j at 3
        }
        if(j==m){
            return i; //When j==m 3==3 return i// To keep first occurance the i is at 0
        }
       }
       return -1;
    }
}
