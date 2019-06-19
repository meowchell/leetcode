package oa.amazon.com;

import java.util.*;

public class Closest2Sum {
    public static void main(String[] args) {
        List<List<Integer>> fwd = new ArrayList<>();
//        fwd.add(Arrays.asList(1,3000));
//        fwd.add(Arrays.asList(2,5000));
//        fwd.add(Arrays.asList(3,7000));¡
//        fwd.add(Arrays.asList(4,10000));
        fwd.add(Arrays.asList(1,2000));
        fwd.add(Arrays.asList(2,7000));
        fwd.add(Arrays.asList(3,6000));

        List<List<Integer>> rtn = new ArrayList<>();
        rtn.add(Arrays.asList(1,4000));
        rtn.add(Arrays.asList(2,3000));
        rtn.add(Arrays.asList(3,8000));
//        rtn.add(Arrays.asList(4,5000));
        Closest2Sum c = new Closest2Sum();
        int maxTravelDistance = 10000;
        System.out.println(c.optimalUtilization(maxTravelDistance, fwd, rtn));

    }


    public List<List<Integer>> bestRoute(int maxTravelDistance, List<List<Integer>> fwd, List<List<Integer>> rtn){
        List<List<Integer>> ret = new ArrayList<>();
        rtn.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1) - o2.get(1);
            }
        });

        PriorityQueue<List<Integer>> maxHeap = new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.get(1) - o1.get(1);
            }
        });

        PriorityQueue<List<Integer>> minHeap = new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1) - o2.get(1);
            }
        });

        for (List<Integer> l : fwd){
            maxHeap.add(l);
        }
        for (List<Integer> l : rtn){
            minHeap.add(l);
        }

        while (!minHeap.isEmpty()&&!maxHeap.isEmpty()) {
            List<Integer> r = minHeap.peek(); //min
            List<Integer> f = maxHeap.peek(); //max
            //decrease in max/
            while (maxHeap.poll().get(1) + minHeap.peek().get(1) > maxTravelDistance) {
                if (!maxHeap.isEmpty()){
                    f = maxHeap.peek();
                } else {
                    f = null;
                    break;
                }
            }
            //increase in min
            if (f == null){
                break;
            }
            while (!minHeap.isEmpty() && minHeap.peek().get(1) + f.get(1) <= maxTravelDistance) {
                r = minHeap.poll();
            }

            ret.add(Arrays.asList(f.get(0), r.get(0)));

        }
        return ret;
    }

    List<List<Integer>> optimalUtilization(int maxTravelDist,
                                           List<List<Integer>> forwardRouteList,
                                           List<List<Integer>> returnRouteList)
    {
        // WRITE YOUR CODE HERE
        List<List<Integer>> ret = new ArrayList<>();
        returnRouteList.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1) - o2.get(1);
            }
        });

        forwardRouteList.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1) - o2.get(1);
            }
        });

        List<Integer> temp = new ArrayList<>();
        int max = 0;

        for(List<Integer> routeFwd : forwardRouteList){
            int distFwd = routeFwd.get(1);
            for(List<Integer> routeRtn : returnRouteList){
                int distRtn = routeRtn.get(1);
                int sum =distRtn+distFwd ;
                if (sum > maxTravelDist) {
                    break;

                } else if(sum == maxTravelDist){
                    List<Integer> route = new ArrayList<>();
                    route.add(routeFwd.get(0));
                    route.add(routeRtn.get(0));
                    ret.add(route);
                } else if (sum > max){
                    if(temp.isEmpty()){
                        temp.add(routeFwd.get(0));
                        temp.add(routeRtn.get(0));
                    }else{
                        temp.set(0, routeFwd.get(0));
                        temp.set(1, routeRtn.get(0));
                    }
                }

            }

        }
        if(!temp.isEmpty()){
            ret.add(temp);
        }
        return ret;

    }
}
