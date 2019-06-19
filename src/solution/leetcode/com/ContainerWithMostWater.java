package solution.leetcode.com;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ContainerWithMostWater c = new ContainerWithMostWater();
        int[] height = new int[]{1,1};
        System.out.println(c.mostWater2(height));
    }
    public int mostWater(int[] height){
        int max = 0;
        for (int i = 0; i < height.length - 1; i++){
            for (int j = i+1; j < height.length ; j++){
                int m = (j - i )* Math.min(height[j] , height[i]);
                max = Math.max(m, max);
            }
        }
        return max;
    }

    public int mostWater2(int[] height){
        int max = 0;
        int len = height.length;
        int loMax = height[0];
        int hiMax = height[len - 1];
        int hi = len - 1;
        int lo = 0;
        while (hi > lo){
            if (height[hi] < hiMax){
                hi --;
                continue;
            }
            if (height[lo] < loMax){
                lo++;
                continue;
            }
            max = Math.max(max, (hi - lo) * Math.min(height[hi], height[lo]));
            if (height[lo] > height[hi]){
                hiMax = Math.max(height[hi], hiMax);
                hi--;
            }else {
                loMax = Math.max(height[lo], loMax);
                lo++;
            }
        }
        return max;
    }
}
