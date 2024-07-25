public class Fib
{
    public static int fib(int n)
    {
        // 0 1 1 2 3 5 ...
        int sum = 0;
        int twoBefore = 0;
        int oneBefore = 1;
        for (int i = 2; i <= n; i++)
        {
            sum = oneBefore + twoBefore;
            twoBefore = oneBefore;
            oneBefore = sum;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(fib(5));
    }
}