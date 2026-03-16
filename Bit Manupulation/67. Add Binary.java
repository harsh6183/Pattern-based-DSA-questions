class Solution {
    public String addBinary(String a, String b) {
        
        //If the b is greater than a
        if(a.length()<b.length()){
            return addBinary(b,a);
        }


        StringBuilder sb = new StringBuilder();
        int carry=0;
        int j =b.length()-1;
        
        for(int i =a.length()-1;i>=0;i--,j--){
            int sum =carry;

            if(a.charAt(i)=='1'){  //Charater value of 1 is 49 and 0 is 48
                sum+=1;
            }

            if( j>=0 && b.charAt(j)=='1'){
                sum+=1;
            }

            sb.append(sum%2); //2%2 is 0 and 
            //carry 1(2/2)
            carry=sum/2; 
        }

        if(carry==1){
            sb.append(1);
        }

        
        return sb.reverse().toString();
    }
}
