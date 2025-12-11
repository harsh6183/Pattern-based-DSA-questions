//45. Jump Game II
/*Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.*/
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
