package solution.leetcode.com;

import java.util.*;

/**
 * Created by huijiej on 4/17/2018.
 */
public class QueueReconstruction {
    public static void main(String[] args) {
        int[][] people = new int[][]{{8,2},{4,2},{4,5},{2,0},{7,2},{1,4},{9,1},{3,1},{9,0},{1,0}};
        QueueReconstruction q = new QueueReconstruction();
        System.out.print(q.reconstructQueue(people).toString());
    }
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
//                if (o1[0] < o2[0]){
//                    return 1;
//                }else  if (o1[0] > o2[0]){
//                    return -1;
//                } else return 0;
                return o1[0]!=o2[0]?-o1[0]+o2[0]:o1[1]-o2[1];
            }
        });
        List<int[]> res = new LinkedList<>();
        for(int[] cur : people){
            res.add(cur[1],cur);

        }

        return res.toArray(new int[people.length][]);
    }

}
