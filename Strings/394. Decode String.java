class Solution {
    int index = 0;

    public String decodeString(String s) {
        return helper(s);
    }

    private String helper(String s) {
        StringBuilder result = new StringBuilder();
        int k = 0;

        while (index < s.length()) {
            char ch = s.charAt(index);

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                index++; // skip '['
                String decoded = helper(s); // recursive call
                
                for (int i = 0; i < k; i++) {
                    result.append(decoded);
                }
                k = 0;
            } 
            else if (ch == ']') {
                return result.toString(); // end current recursion
            } 
            else {
                result.append(ch);
            }

            index++;
        }

        return result.toString();
    }
}
