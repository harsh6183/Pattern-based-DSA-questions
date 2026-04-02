class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int left =0;
        int right=0;

        while(right<arr.length){
            //If we find a space, reverse the word
            if(arr[right]==' '){
                reverse(arr,left,right-1);
                left=right+1;
            }
            right++;
        }
        //Last word reversing
        reverse(arr,left,right-1);
        return new String(arr);
    }

    //Helper function using the logic of two pointer
    //Swaping the characters place so that it will make reverse word
    private void reverse(char[] arr, int left , int right){
        while(left<right){
            char temp= arr[left];
            arr[left++]=arr[right];
            arr[right--]= temp;
        }
    }
}
