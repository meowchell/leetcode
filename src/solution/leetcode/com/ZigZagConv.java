package solution.leetcode.com;

public class ZigZagConv {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
//        String s = "A";
        ZigZagConv z = new ZigZagConv();
        System.out.println(z.convert2(s, 3));


    }
    public String convert2(String s, int numRows) {
        StringBuilder[] sbs = new StringBuilder[numRows];
        int c = 0;
        for (int i = 0; i < numRows ; i++){
            sbs[i] = new StringBuilder();
        }

        for (int i = 0; i < numRows && c < s.length(); i++){
            i = 0;
            while (i < numRows && c < s.length()){
                sbs[i++].append(s.charAt(c++));
            }
            i = numRows -2 ;
            while (i > 0 && c < s.length()){
                sbs[i--].append(s.charAt(c++));
            }

        }
        StringBuilder t = new StringBuilder();
        for (StringBuilder sb : sbs){
            t.append(sb);
        }


        return t.toString();

    }


    public String convert(String s, int numRows) {
        String ret = "";
        if(s == null || s.isEmpty() || numRows < 0){
            return ret;
        }
        if(numRows == 1){
            return s;
        }
        char[] ac = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < numRows ; i++){
            j = i;
            if (j < s.length()){
                sb.append(ac[j]);
            }else {break;}

            while (j < s.length()){
                if(i <numRows - 1){
                    j = j+2*(numRows-i) -2;
                    if (j < s.length()){
                        sb.append(ac[j]);
                    }else {
                        break;
                    }
                }

                if (i > 0){
                    j = j+2*i;
                    if (j < s.length()){
                        sb.append(ac[j]);
                    }else {
                        break;
                    }
                }

            }
        }
        ret = sb.toString();

        return ret;
    }
}
