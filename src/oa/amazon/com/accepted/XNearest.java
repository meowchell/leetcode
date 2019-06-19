package oa.amazon.com.accepted;

import java.util.*;

public class XNearest {
    public static void main(String[] args) {
//        int[][] locations = new int[][]{{1,4},{2,3},{0,5},{2,1}};
        int[][] locations = new int[][]{{1,2},{3,4},{1,-1},{1,-1}};
       XNearest x = new XNearest();
        System.out.println(x.findNearest(4, locations, 2));

    }

    public List<List<Integer>> findNearest(int n, int[][] locations, int d){

        List<List<Integer>> ret = new ArrayList<>();
        if (d > n || d<= 0){
            return ret;
        }
        PriorityQueue<LocationWithDistance> maxHeap = new PriorityQueue<>(d, new Comparator<LocationWithDistance>() {
            @Override
            public int compare(LocationWithDistance o1, LocationWithDistance o2) {
                return o2.distance - o1.distance;
            }
        });

        int[] location;

        for (int i = 0; i < n; i++){
            location = locations[i];
            LocationWithDistance l = new LocationWithDistance(location);
            if (maxHeap.size() < d){
                maxHeap.add(l);
            }else if (maxHeap.peek().distance > l.distance){
               maxHeap.poll();
               maxHeap.add(l);
            }
        }

        while (!maxHeap.isEmpty()) {
            List<Integer> p = new ArrayList<>();
            int[] l = maxHeap.poll().location;
            p.add(l[0]);
            p.add(l[1]);
            ret.add(p);

        }

        return ret;
    }

    public class LocationWithDistance{
        int[] location;
        int distance;

        public LocationWithDistance(int[] location){
            this.location = location;
            this.distance = location[0]*location[0] + location[1]*location[1];

        }

    }

}

