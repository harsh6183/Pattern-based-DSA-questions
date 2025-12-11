//Leetcode 58. Length of Last Word


//Optimal approach
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                length++;
            }
            else if(length>0){
                break;
            }
        }
        return length;
        
    }
}

//Using extra array
class Solution{
  public int lengthOfLastWord(String s){
    String[] word = s.split(" ");
    String lastWord = word[word.length-1];
    int length=lastWord.length();
    return length;
  }
}
    
