class Solution {
    public String maximumOddBinaryNumber(String s) {
        int countZero =0;
        int countOne=0;

        for(char c: s.toCharArray()){
            if(c=='0'){
                countZero++;
            }else{
                countOne++;
            }
        }

        StringBuilder ans = new StringBuilder();

        ans.append("1");
        countOne--;

        ans.append("0".repeat(countZero));
        ans.append("1".repeat(countOne));

        return ans.reverse().toString();
    }
}
