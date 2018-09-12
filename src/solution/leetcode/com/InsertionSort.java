package solution.leetcode.com;

/**
 * Created by huijiej on 4/23/2018.
 */
public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] a = new int[]{1,0,0};
        is.insertionSort(a);
        for (int i : a){
            System.out.println(i);

        }



    }
    public void insertionSort(int[] array){
        for (int i = 1; i < array.length ; i++){
            int cur = array[i];
            int j = 0;
            while (j < i){
                if (cur< array[j]){
                    break;
                }else {
                    j++;
                }
            }
            if (i==j){
                continue;
            }else {
                move(array, i, j);
            }

        }
    }
        public void move(int[] array, int from, int to) {
            int f = from;
            int t = to;
            int fVal = array[from];
            while (t < f) {
                array[f] = array[f-1];
                f--;
            }
            array[to] = fVal;
        }
}
