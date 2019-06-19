package solution.leetcode.com;

/**
 * Created by huijiej on 7/5/2017.
 */
public class ReturnFinallyBlockTest {
    public static void main(String[] args) {
    helper();
    }
    static void helper(){
        try {
            return;
        }finally {
            System.out.print("finally printing");
        }


    }
}
