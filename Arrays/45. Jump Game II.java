class Solution {
    public int jump(int[] nums) {
        int curReach=0; //Farthest Index we can reach by number of jumps
        int curMax=0;  //Farthest Index we reach exploring the range
        int jump=0;    //Min number of jumps

        for(int i =0;i<nums.length-1;i++){
            if(i+nums[i]>curMax){
                curMax=i+nums[i];
            }
            if(i==curReach){
                jump++;
                curReach=curMax;
            }
        }
        return jump;

        }
    }
