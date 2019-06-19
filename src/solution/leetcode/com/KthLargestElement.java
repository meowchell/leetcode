package solution.leetcode.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    int[] minHeap;

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
//        int k = 4;
        KthLargestElement kth = new KthLargestElement();
//        int result = kth.findKthLargest1(nums, k);
//        System.out.println(result);
        kth.queueTest(nums);

    }

    public void queueTest(int[] nums) {

//        PriorityQueue<Integer> q = new PriorityQueue();
//        for (int n : nums) {
//            q.add(n);
//
//        }
//        for (int n: q){
//            System.out.println(n);
//        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(2, Collections.reverseOrder());
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
//...

        Integer val = null;
        while( (val = queue.poll()) != null) {
            System.out.println(val);
        }
    }
    public int findKthLargest1(int[] nums, int k){
        PriorityQueue<Integer> q = new PriorityQueue();
        for (int n:nums){
            q.add(n);

            if (q.size() > k){
                q.poll();
            }

        }

        return q.poll();
    }

    public int findKthLargest(int[] nums, int k) {
        this.minHeap = new int[k];
        this.minHeap[0] = nums[0];
        for (int i = 1; i < k; i++){
            this.buildHeap(nums[i], i);
        }
//        for (int m : minHeap){
//            System.out.println(m);
//        }
        for (int i = k; i < nums.length; i++){
            if (nums[i] > this.minHeap[0]){
                downAdjust(nums[i], k);
//                System.out.println(Arrays.toString(this.minHeap));
            }
        }
        return this.minHeap[0];
    }

    public void buildHeap(int n, int l){
        while (l != 0){
            int rootInd = (l-1)/2;
            if (this.minHeap[rootInd] > n){
                int temp = this.minHeap[rootInd];
                this.minHeap[rootInd] = n;
                this.minHeap[l] = temp;
            } else {
                this.minHeap[l] = n;
                break;
            }
            l = rootInd;
        }



    }


    public int downAdjust(int n, int k){
        this.minHeap[0] = n;
        int parent = 0;
        int left = 0;
        int right = 0;
        while (left < k || right < k) {
            left = 2 * parent + 1;
            right = 2 * parent + 2;
            if (left < k && right < k) {
                if (this.minHeap[left] < this.minHeap[right]) {
                    if (n > this.minHeap[left]) {
                        this.minHeap[parent] = this.minHeap[left];
                        parent = left;
                        continue;
                    } else {
                        this.minHeap[parent] = n;
                        break;
                    }

                } else {
                    if (n > this.minHeap[right]) {
                        this.minHeap[parent] = this.minHeap[right];
                        parent = right;
                        continue;
                    } else {
                        this.minHeap[parent] = n;
                        break;
                    }

                }
            } else if (left < k ){
                if (n > this.minHeap[left]) {
                    this.minHeap[parent] = this.minHeap[left];
                    parent = left;
                    continue;
                } else {
                    this.minHeap[parent] = n;
                    break;
                }

            } else if (right < k ){
                if (n > this.minHeap[right]) {
                    this.minHeap[parent] = this.minHeap[right];
                    parent = right;
                    continue;
                } else {
                    this.minHeap[parent] = n;
                    break;
                }

            }
        }
        this.minHeap[parent] = n;
        return 0;
}


}
