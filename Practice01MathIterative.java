public class Practice01MathIterative implements Practice01Math{

    /* iterative factorial */

    public int fact(int n) {
        int fact = 1;
        if (n<0) {
            throw new IllegalArgumentException("Can't be negative");
        }
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    /*iterative fibonacci  */

    public int fib(int n){
        int i;
        int f[] = new int[n+2];
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <=n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];

    }