class Solution {
    public int findDuplicate(int[] nums) {
        int slow =0;
        int fast =0;

        do{     //Used do while loop to check atleast 1 condition pass
            slow = nums[slow];        //Slow=slow.next
            fast=nums[nums[fast]];   //fast=fast.next.next but here have to increase the index that why it represented in index formate
            if(slow ==fast){
                break;
            }
        }while(slow!=fast);


        //To get at which point the loop has been started or (To return the repeated number present in the array)
        int n1= 0; 
        int n2=slow;
        while(n1!=n2){
            n1=nums[n1];
            n2=nums[n2];
        }
        return n1;

    }
}
