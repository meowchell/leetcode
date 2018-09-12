package solution.leetcode.com;

/**
 * Created by huijiej on 9/8/2017.
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a={1,2};
        int[] b={2,5,5,6};
        double mid = helper(a,b);
        System.out.println(mid);

    }

    public static double helper(int[] a, int[]b){
        //edge cases
        double retVal = 0;
        int index;
        if (b[0]>=a[a.length-1]){
            if ((a.length+b.length)%2==1){
                index = (a.length+b.length+1)/2-1;
                if (index <a.length){
                    retVal = a[index];
                }else {
                    retVal = b[index-a.length];
                }
            }else {
                index = (a.length+b.length)/2 - 1;
                if (index > a.length-1){
                    retVal = (b[index-a.length] + b[index-a.length+1])/2.0;
                }else if (index + 1 < a.length){
                    retVal = (a[index]+a[index+1])/2.0;
                }else if (index == a.length - 1){
                    retVal = (a[index]+b[0])/2.0;
                }
            }

        }else if(a[0]>=b[b.length-1]){
            return helper(b,a);
        }
        if (a.length <= b.length){
            //find a place to insert a into b
            int[] ab = new int[a.length+b.length];
            for (int i = 0; i < a.length; i++){
//                a[i]
            }


        }else {
            return helper(b,a);
        }





        return retVal;
    }



}


