package org.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // 1. 새 구간과 겹치지 않는 앞부분 추가
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // 2. 겹치는 구간들 병합 (Merge Overlapping)
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval); // 병합된 새 구간 추가

        // 3. 나머지 뒷부분 추가
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] argc){
        InsertInterval main = new InsertInterval();
        System.out.println(Arrays.deepToString(main.insert(new int[][]{{1, 3}, {6, 9}},new int[]{2,5})));
    }
}
