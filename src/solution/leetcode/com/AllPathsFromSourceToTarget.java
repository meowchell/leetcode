package solution.leetcode.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huijiej on 4/21/2018.
 */
public class AllPathsFromSourceToTarget {
    public static void main(String[] args) {
       AllPathsFromSourceToTarget al = new AllPathsFromSourceToTarget();
       List list = al.allPathsSourceTarget(new int[][]{{1,2}, {2}, {3}, {}});
       System.out.println(list);
//        for (int i : new int[]{1,2,3,2341,2,0,1,23}){
//            System.out.println(i);
//        }


    }


    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        if (graph==null || graph.length == 0 || graph[0].length == 0){return null;}
        int target = graph.length - 1;
        List<Integer> path = new ArrayList<>();
        path.add(0);
        List<List<Integer>> res =new ArrayList<>();
        helper(0, target, graph, res, path);

        return res;
    }
    public void helper(int source, int target, int[][] graph, List<List<Integer>> res, List<Integer> path){
        if(target == source){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i : graph[source]){
            path.add(i);
            helper(i, target, graph, res, path);
            path.remove(path.size() - 1);
        }
    }
}
