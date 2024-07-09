public class SumOdds
{
    public static int sumOdds(int n)
    {
        int sum = 0;
        int odd = 1;
        while (odd < 1 + 2*n)
        {
            sum += odd;
            odd += 2;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(sumOdds(5));
    }
}