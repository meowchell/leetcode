package solution.leetcode.com;

/**
 * Created by huijiej on 9/8/2017.
 */
public class MedianOfTwoSortedArrays2 {
    static int m;
    public static void main(String[] args) {
        int[] b={11};
        int[] a={1,1,1};
        MedianOfTwoSortedArrays2 f = new MedianOfTwoSortedArrays2();
        double mid = f.helper(a,b);
        System.out.println(mid);

    }

    public double helper(int[] sortedA, int[] sortedB){
        //edge cases
        double retVal = 0;
        retVal = findMedian(sortedA, sortedB);
        if (m >= sortedA.length|| m < 0){
            retVal = findMedian(sortedB, sortedA);
        }




        return retVal;
    }

    public double findMedian(int[] sortedA,int[] sortedB){
        double retVal=0.0;
        m = sortedA.length/2;
        int left, right;
        while(m>=0&&m<sortedA.length){
            int i = findIndexToInsertTheNumber(sortedA[m], sortedB);
            //#left=#right
            left = m+i;
            right = sortedA.length-1-m+sortedB.length-i;
            if (left==right){
                return sortedA[m];
            }else if ( left-right==1 ){
                if (m>0){
                    retVal = sortedA[m-1]>sortedA[i]?(sortedA[m-1]+sortedA[m])/2.0:(sortedB[i]+sortedA[m])/2.0;
                    return retVal;
                }else {
                    retVal = (sortedB[i]+sortedA[m])/2.0;
                }

            }else if (left-right==-1){
                if (m>0){
                    retVal = sortedA[m+1]<sortedA[i]?(sortedA[m+1]+sortedA[m])/2.0:(sortedB[i]+sortedA[m])/2.0;
                    return retVal;
                }else {
                    retVal = (sortedB[i]+sortedA[m])/2.0;
                }
            } else if (left > right) {
                //move right
                m = (m+1)/2-1;
            } else if (left < right) {
                //move left
                m = (m+sortedA.length+1)/2;
            }

        }
        return retVal;
    }


    int findIndexToInsertTheNumber(int n, int[] sortedArray){
        int i= sortedArray.length/2;
        while (i>=0&&i<sortedArray.length){
            if (n==sortedArray[i]){
                if (i==0){
                    return i;
                }else {
                    i = i/2;
                }
            }else if (n>sortedArray[i]){
                if (i==sortedArray.length-1){
                    return i+1;
                }else if (n < sortedArray[i+1]){
                    return i+1;
                }else {
                    i = (i+sortedArray.length)/2;
                }
            }else if (n<sortedArray[i]){
                if (i==0){
                    return i;
                }else if (n>sortedArray[i-1]){
                    return i;
                }else {
                    i = i/2;
                }
            }

        }

        return i;

    }


}


