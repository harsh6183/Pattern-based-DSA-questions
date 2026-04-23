class Solution {
    public int divide(int dividend, int divisor) {
        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Sign handling
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int ans = 0;

        while (dvd >= dvs) {
            int cnt = 0;

            // Find max shift
            while (dvd >= (dvs << (cnt + 1))) {
                cnt++;
            }

            // Update result AFTER loop
            ans += (1 << cnt);
            dvd -= (dvs << cnt);
        }

        return negative ? -ans : ans;
    }
}
