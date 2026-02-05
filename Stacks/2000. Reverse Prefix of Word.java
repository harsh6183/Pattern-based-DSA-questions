class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i =0;i<word.length();i++){
            char currentChar = word.charAt(i);
            stack.push(currentChar);

            if(currentChar ==ch){
                //insert the elemetns from the stack
                while(!stack.isEmpty()){
                    res.append(stack.pop());
                }
                res.append(word.substring(i+1,word.length()));
                return res.toString();
            }
        }
        return word;
    }
}
