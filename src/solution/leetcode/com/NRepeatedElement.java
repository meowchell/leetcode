package solution.leetcode.com;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElement {
    public int repeatedNTimes(int[] A) {
        int ret = 0;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i:A){
            counter.put(i, counter.getOrDefault(i, 0)+1);
            if (counter.get(i) == A.length/2){
                return i;
            }
        }

        return ret;
    }

    public int repeatedNTimes1(int[] A) {
        for (int i = 0; i <A.length-2; i++){
            if (A[i] == A[i+1] || A[i] == A[i+2]){
                return A[i];
            }
        }

        return A[A.length -1];
    }

}
