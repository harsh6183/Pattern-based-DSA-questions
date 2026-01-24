class Solution {
    public int largestInteger(int num) {

        //Brute force approach
        //Time complexity O(n^2) space O(n)
    //     char[] arr = Integer.toString(num).toCharArray();

    //     for(int i =0; i<arr.length;i++){
    //         int maxPos=i;

    //         for(int j =i+1;j<arr.length;j++){

    //             if(arr[j]>arr[maxPos] && (arr[i]-arr[j])%2==0){//Means same if both numbers are same)
    //             maxPos=j;
    //         }
    //     }

    //     char temp=arr[i];
    //     arr[i]=arr[maxPos];
    //     arr[maxPos]=temp;
    // }
    // return Integer.parseInt(new String(arr));



        //Time complexity O(n) space O(n)

        // Max-heaps for even and odd digits
        PriorityQueue<Integer> evenHeap =
                new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> oddHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        char[] digits = String.valueOf(num).toCharArray();

        // Step 1: separate digits by parity
        for (char c : digits) {
            int d = c - '0';
            if (d % 2 == 0) {
                evenHeap.offer(d);
            } else {
                oddHeap.offer(d);
            }
        }

        // Step 2: rebuild number using largest possible digits
        StringBuilder result = new StringBuilder();

        for (char c : digits) {
            int d = c - '0';
            if (d % 2 == 0) {
                result.append(evenHeap.poll());
            } else {
                result.append(oddHeap.poll());
            }
        }

        return Integer.parseInt(result.toString());
    }
}
