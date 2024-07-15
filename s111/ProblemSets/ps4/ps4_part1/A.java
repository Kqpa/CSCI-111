import java.util.Arrays;

public class A
{
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday",
                                         "Wednesday", "Thursday", 
                                         "Friday", "Saturday"};
      
    public static void mystery(int[] arr)
    {
        for (int i = 0; i < arr.length / 2; i++)
        {
            int n = arr.length - 1 - i;
            int val = arr[n];
            arr[n] = arr[i];
            arr[i] = val;
        }
    }

    public static int dayNumber(String s)
    {
        for (int i = 0; i < DAYS.length; i++)
        {
            if (s.equals(DAYS[i]))
            {
                return i;
            }
        }
        return -1;
    }

    public static void incrementAll(int[] data, int incr)
    {
        for (int i = 0; i < data.length; i++)
        {
            data[i] += incr;
        }
    }    

    public static boolean data(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        // int[] v = {0,1,2,3,4,5,6,7};
        // int[] a = {3,6,9,12,15};
        // int[] o = {1,3,5,7,9};
        // mystery(a);
        // System.out.println(Arrays.toString(a));
        // mystery(v);
        // System.out.println(Arrays.toString(v));
        // System.out.println(data(o));
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        incrementAll(a, 2);
        System.out.println(Arrays.toString(a));
    }    
}
