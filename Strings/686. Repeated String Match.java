class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder str = new StringBuilder();
        int count =0;
        //Until the string length of a not equal to the string length of the b just repeat it
        while(str.length()<b.length()){
            str.append(a);
            count++;
        }

        //Checking the string b already present or not
        if(str.indexOf(b)!=-1){
            return count;
        }

        //Now adding exactly 1 more time a to handle structural boundary offset
        str.append(a);
         if(str.indexOf(b)!=-1){
            return count+1;
        }

        //If the structure is impossible then returning -1
        return -1;
    }
}

//Using sliding window two pointer approach
// class Solution {
//     public int repeatedStringMatch(String a, String b) {
//         int lenA = a.length();
//         int lenB = b.length();
        
//         // Try starting the match at every possible index of the original string 'a'
//         for (int i = 0; i < lenA; i++) {
//             int j = 0;
            
//             // Match as many characters of 'b' as possible starting from index 'i'
//             while (j < lenB && a.charAt((i + j) % lenA) == b.charAt(j)) {
//                 j++;
//             }
            
//             // If the entire string 'b' was successfully matched
//             if (j == lenB) {
//                 // Calculate how many full or partial blocks of 'a' were spanned
//                 int totalCharsSpanned = i + lenB;
//                 return (totalCharsSpanned + lenA - 1) / lenA; // Ceil division
//             }
//         }
        
//         return -1;
//     }
// }
