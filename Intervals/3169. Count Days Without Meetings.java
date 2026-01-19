import java.util.*;

class Solution {
    public int countDays(int days, int[][] meetings) {
        if (meetings.length == 0) return days;

        // Sorting meetings by start day
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        int meetingDays = 0;

        int start = meetings[0][0];
        int end = meetings[0][1];

        for (int i = 1; i < meetings.length; i++) {
            int s = meetings[i][0];
            int e = meetings[i][1];

            // Overlapping or continuous
            if (s <= end + 1) {
                end = Math.max(end, e);
            } else {
                meetingDays += end - start + 1;
                start = s;
                end = e;
            }
        }

        // Add last interval
        meetingDays += end - start + 1;

        return days - meetingDays;

        //Time complexity O(n logn) due to sorting
        //Space complexity O(1) 
    }
}
