
public class FibRecursive {

    public static int fib(int N)
    {
        if (N <= 1)
        {
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    
}
