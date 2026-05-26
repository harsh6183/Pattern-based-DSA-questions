class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0 && s.substring(0, i).repeat(n / i).equals(s)) {
                return true;
            }
        }
        return false;
    }
}
// class Solution {
//     public boolean repeatedSubstringPattern(String s) {

//         String doubled = s + s;

//         String trimmed = doubled.substring(1, doubled.length() - 1);

//         return trimmed.contains(s);
//     }
// }

// class Solution {
//     public boolean repeatedSubstringPattern(String s) {

//         int n = s.length();

//         // Try all possible substring lengths
//         for (int len = 1; len <= n / 2; len++) {

//             // Length must divide string completely
//             if (n % len == 0) {

//                 String sub = s.substring(0, len);

//                 StringBuilder sb = new StringBuilder();

//                 int repeat = n / len;

//                 // Build repeated string
//                 for (int i = 0; i < repeat; i++) {
//                     sb.append(sub);
//                 }

//                 // Compare
//                 if (sb.toString().equals(s)) {
//                     return true;
//                 }
//             }
//         }

//         return false;
//     }
// }
