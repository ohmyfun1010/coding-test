package org.src;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end   = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                // 겹치면 확장
                end = Math.max(end, intervals[i][1]);
            } else {
                // 안 겹치면 저장
                result.add(new int[]{start, end});
                start = intervals[i][0];
                end   = intervals[i][1];
            }
        }

        // 마지막 구간 추가
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] argc){
        MergeIntervals main = new MergeIntervals();
        System.out.println(Arrays.deepToString(main.merge(new int[][]{{1,4}, {2, 3}})));
    }
}
