class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];

        //Making String based array
        int i =0;
        for(int num:nums){
            str[i]=Integer.toString(num);
            i++;
        }

        //Using comparator to sort on the basis of largest number formation
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));

        if(str[0].equals("0")){
            return "0";
        }

        StringBuilder res= new StringBuilder();

        for(String s: str){
            res.append(s);
        }
        return res.toString();
    }
}
