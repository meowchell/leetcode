package solution.leetcode.com;

public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap b = new BinaryGap();
        System.out.println(b.binaryGap(22));
    }

    public int binaryGap(int N) {
        String binStr = Integer.toBinaryString(N);
        int l = 0;
        int gap = 0;
        for ( int i = 0; i < binStr.length(); i++){
            if(binStr.charAt(i) == '1'){
                gap = Math.max( i - l, gap);
                l = i;
            }
        }
        return gap;
    }
}
