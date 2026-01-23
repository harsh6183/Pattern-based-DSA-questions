import java.util.*;

class MyCalendar {

    //Time Comp O(n) 
    //Space comp O(n)
    // List to store all booked events
    List<int[]> calendar;

    public MyCalendar() {
        calendar = new ArrayList<>();
    }

    public boolean book(int start, int end) {

        for (int[] event : calendar) {
            int s = event[0];
            int e = event[1];

            // check overlap
            if (Math.max(start, s) < Math.min(end, e)) {
                return false;
            }
        }

        // no overlap → add event
        calendar.add(new int[]{start, end});
        return true;
    }
}


/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */
