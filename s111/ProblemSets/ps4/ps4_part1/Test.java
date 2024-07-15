import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        int[] values = {0, 1, 2, 3, 4, 5, 6, 7};
        for (int i = 1; i < values.length; i += 2) {
            values[i] = values[i - 1];
        }
        System.out.println(Arrays.toString(values));
    }
}