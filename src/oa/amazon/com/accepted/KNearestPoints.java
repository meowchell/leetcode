package oa.amazon.com.accepted;

import solution.leetcode.com.KthLargestElement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KNearestPoints {
 public static void main(String[] args) {

//  int[][] locations = {{4,6},{4,7},{4,4},{2,5},{1,1}};
  int[][] locations = {{4,6},{4,6},{4,6},{-4,-6},{-4,6}};

  Point[] points = new Point[locations.length];
  int cnt = 0;
  for (int[] location: locations){
    points[cnt++] = new Point(location[0], location[1]);
  }
 Point origin = new Point(0,0);
  int k = 3;

  KNearestPoints kNearestPoints = new KNearestPoints();
  for (Point p:kNearestPoints.kClosest(points, origin, k)){
      System.out.println(p.x+", "+p.y);
  }


 }
    //https://www.lintcode.com/problem/k-closest-points/discuss
 public Point[] kClosest(Point[] points, Point origin, int k) {
  Point[] ret = new Point[k];
  if (points.length < k || k<= 0){
   return ret;
  }
  PriorityQueue<Point> maxHeap = new PriorityQueue<>(k, new Comparator<Point>() {
   @Override
   public int compare(Point o2, Point o1) {
     int diff = (o1.x - origin.x) * (o1.x - origin.x) + (o1.y-origin.y) * (o1.y - origin.y) -
             (o2.x - origin.x) * (o2.x - origin.x) - (o2.y-origin.y) * (o2.y - origin.y);

     if (diff == 0){
      if (o1.x - o2.x == 0){
       return o1.y - o2.y;
      }
      return o1.x - o2.x;
     }
    return diff;
   }
  });


  for (int i = 0; i < points.length; i++) {
      Point point = points[i];
      if (maxHeap.size() < k){
          maxHeap.add(point);
      }else if (maxHeap.comparator().compare(maxHeap.peek(),point) < 0){
          maxHeap.poll();
          maxHeap.add(point);

      }

  }
  int cnt = k-1;
  while (cnt >= 0){
   Point pt = maxHeap.poll();
   ret[cnt--] = pt;
  }

  return ret;
 }


}



  class Point {
      int x;
      int y;
      Point() { x = 0; y = 0; }
      Point(int a, int b) { x = a; y = b; }
  }
