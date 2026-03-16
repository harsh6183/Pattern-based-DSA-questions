// class Solution {
//     public int reverseBits(int n) {
//         int res=0;

//         for(int shift=31;shift>=0;shift--){
//             int bit = n & 1;
//             res = res+(bit << shift);//left shift
//             n=n>>1; //right shift
//         }
//         return res;
//     }
// }

class Solution {
    public int reverseBits(int n) {
        int res = 0;

        for(int i = 0; i < 32; i++) {
            res = res << 1;      // make space for next bit
            //adding then doing or operation 
            res = res | (n & 1); // add last bit of n
            n = n >> 1;          // shift n
        }

        return res;
    }
}
