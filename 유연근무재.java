import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int n = schedules.length;
        int days = timelogs[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int limit = ceilTo10(toMinutes(schedules[i]));
            boolean bad = false;

            for (int d = 0; d < days; d++) {
                int day = (startday + d - 1) % 7 + 1; 
                if (day == 6 || day == 7) continue; // 주말은 건너뜀

                int logTime = ceilTo10(toMinutes(timelogs[i][d]));
                if (logTime > limit) {
                    bad = true;
                    break;
                }
            }

            if (bad) count++;
        }

        return count;
    }

    // HHMM → 분 단위 변환
    private int toMinutes(int hhmm) {
        return (hhmm / 100) * 60 + (hhmm % 100);
    }

    // 10분 단위 올림
    private int ceilTo10(int min) {
        return (min + 9) / 10 * 10;
    }
}
