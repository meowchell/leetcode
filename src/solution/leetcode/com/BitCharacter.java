package solution.leetcode.com;

public class BitCharacter {
    public static void main(String[] args) {
        BitCharacter b = new BitCharacter();
        System.out.println(b.isOneBitCharacter(new int[]{1,1,1,0}));
    }
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        if (bits[n -1] == 0 && bits[n-2] == 0) return true;
        int counter = 0;
        for (int i = bits.length -2 ; i >= 0 ; i--){
           if (bits[i] == 1){counter++;}
           else break;
        }
        if (counter % 2 == 1){
            return false;
        }
        return true;
    }
}
