public class Countdown
{
    public static void printCountdown(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            if (i != n)
            {
                System.out.print(i + "...");
            }
            else
            {
                System.out.println(i);
            }
            sum += i;
        }
        System.out.println("the sum of the integers is " + sum);
    }
    public static void main(String[] args)
    {
        printCountdown(5);
    }    
}
