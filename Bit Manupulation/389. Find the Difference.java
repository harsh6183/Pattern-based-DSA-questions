class Solution {
    public char findTheDifference(String s, String t) {
        //Approach 1 using HashMap

        // HashMap<Character,Integer> map = new HashMap<>();
        // for(char ch : s.toCharArray()){
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }
        //  for(char ch : t.toCharArray()){
        //     map.put(ch,map.getOrDefault(ch,0)-1);
        //     if(map.get(ch)<0){
        //         return ch;
        //     }
        // }
        // return ' ';


        //Approach 2 using Xor

        int XOR = 0;

        for(char ch : s.toCharArray()){
            XOR ^=ch;
        }
        for(char ch :t.toCharArray()){
            XOR^=ch;
        }
        return (char)XOR;

    }
}
