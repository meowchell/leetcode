package solution.leetcode.com;

/**
 * Created by huijiej on 5/14/2018.
 */
public class Fibonacci {
    final int MAX = 500;
    final int NIL = -1;

    int lookup[] = new int[MAX];
    void _initialize()
    {
        for (int i = 0; i < MAX; i++)
            lookup[i] = NIL;
    }

    /* function for nth Fibonacci number */
    int fib1(int n)
    {
        if (lookup[n] == NIL)
        {
            if (n <= 1)
                lookup[n] = n;
            else
                lookup[n] = fib1(n-1) + fib1(n-2);
        }
        return lookup[n];
    }

    int fib(int n)
    {
        if ( n <= 1 )
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args)
    {
        Fibonacci f = new Fibonacci();
        int n = 4;
        f._initialize();
        System.out.println("Fibonacci number is" + " " + f.fib1(n));
    }
}
