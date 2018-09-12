package solution.leetcode.com;

import java.util.List;

/**
 * Created by huijiej on 3/23/2018.
 */
public class InsertInterval {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int start = newInterval.start;
        int end = newInterval.end;
        int leftIndex = 0;
        int rightIndex = intervals.size();
        boolean mergeLeft = false;
        boolean mergeRight = false;

        for (;leftIndex < intervals.size(); leftIndex++){
            if (intervals.get(leftIndex).start > end){

            }
        }



        return intervals;


    }
}
