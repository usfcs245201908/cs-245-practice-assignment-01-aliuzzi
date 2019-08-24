public class Practice01MathRecursive implements Practice01Math {

/* recursive factorial */

    public int fact(int n){
        if (n<0){
            throw new IllegalArgumentException("Can't be negative.");
        }
        if (n==0){
            return 1;
        }else{
            return n* fact(n-1);
        }
    }
    /* recursive fibonacci */

    public int fib(int n){
        if (n == 0 || n ==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
