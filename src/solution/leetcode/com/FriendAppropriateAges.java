package solution.leetcode.com;

/**
 * Created by huijiej on 4/30/2018.
 */
public class FriendAppropriateAges {
    public int numFriendRequests(int[] ages) {
        int res = 0;
        int[] numInAge = new int[121]; //count of each number

        for (int i: ages){
            numInAge[i]++;
        }
        int[] sumInAge = new int[121];
        for (int i = 1; i< ages.length; i++){
            sumInAge[i] = numInAge[i]+sumInAge[i-1]; //sum of count for numbers less or equal
        }

        for (int i = 1; i < sumInAge.length; i++){
            if (sumInAge[i] == 0) continue;
            int count = sumInAge[i] - sumInAge[i/2+7];
            res += count * numInAge[i] - numInAge[i];
        }
        return res;
    }


    public int numFriendRequests0(int[] ages) {
        int count = 0;
        for (int i = 0; i < ages.length; i++){
            count += helper(ages[i], i, ages);
        }


        return count;

    }

    int helper(int aAge, int k, int[] ages){
        int count = 0;
        for (int i = 0; i < ages.length; i++){
            if (i == k){
                continue;
            }if (ages[i]>aAge||(0.5 * aAge+7 >= ages[i])||((aAge<100)&&ages[i]>100)){
                continue;
            }
            count++;
        }
        return count;
    }
}
