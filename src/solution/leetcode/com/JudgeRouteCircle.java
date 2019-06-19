package solution.leetcode.com;

public class JudgeRouteCircle {


    public static void main(String[] args) {
        JudgeRouteCircle asf = new JudgeRouteCircle();
        boolean r = asf.judgeCircle("UDRRLL");
        System.out.print(r);
    }

    public boolean judgeCircle(String moves) {
        boolean retVal = false;
        int h=0, v = 0;
//        right h+1
//        left h-1
//        up v+1
//        down v-1
        for (char m : moves.toUpperCase().toCharArray()){
            switch (m){
                case 'U':v++;
                    break;
                case 'D':v--;
                    break;
                case 'L':h--;
                    break;

                case 'R': h++;
                    break;
            }
        }
        if (h==0&&v==0){
            retVal = true;
        }
        return retVal;
    }
}

