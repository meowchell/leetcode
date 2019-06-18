package solution.leetcode.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        MergeIntervals m = new MergeIntervals();
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(15,18));
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(8,10));
        m.merge(intervals).stream().forEach(o-> System.out.println(o.start+", "+o.end));;

    }
    public List<Interval> merge(List<Interval> intervals) {
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start == o2.start){
                    return o1.end - o2.end;
                }
                return o1.start - o2.start;
            }
        });
        intervals.stream().forEach(o-> System.out.println(o.start+", "+o.end));
        System.out.println();
        int i = 0;
        List<Interval> ret = new ArrayList<>();
        while (i < intervals.size()) {
            Interval itv = intervals.get(i);
            while (i++ < intervals.size()-1 && itv.end >= intervals.get(i).start-1){
                itv.end = Math.max(itv.end,  intervals.get(i).end);
            }
            ret.add(itv);
        }

        return ret;

    }
    public static class Interval{
        int start;
        int end;
        Interval(){start = 0; end = 0;}
        Interval(int s, int e){start = s; end = e;}
    }
}
