package solution.leetcode.com;

/**
 * Created by huijiej on 4/24/2018.
 */
public class ShortestDistanceToCharacter {
    public static void main(String[] args) {
        ShortestDistanceToCharacter s = new ShortestDistanceToCharacter();
        s.shortDistance("loveleetcode",'e');
    }
    public int[] shortDistance(String S, char C) {
        int[] distance = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            int l = S.substring(0, i).lastIndexOf(C);
            int r = S.substring(i).indexOf(C);
            if (l != -1 && r!= -1){
                distance[i] = Math.min(r, i-l);
            } else if (l == -1){
                distance[i] = r;
            } else if ( r == -1){
                distance[i] = i - l;
            }
        }
        return distance;
    }

}
