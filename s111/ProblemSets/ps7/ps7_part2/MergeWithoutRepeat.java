import java.util.Arrays;

public class MergeWithoutRepeat
{
    public static int[] merge(int[] a1, int[] a2)
    {
        if (a1 == null || a2 == null || a1.length == 0 || a2.length == 0)
        {
            throw new IllegalArgumentException();
        }
        
        int[] inter = new int[a1.length + a2.length];

        Sort.mergeSort(a1);
        Sort.mergeSort(a2);

        int a_1 = 0; // Index for a1
        int a_2 = 0; // Index for a2
        int i = 0; // Index for inter
        while (a_1 < a1.length && a_2 < a2.length)
        {
            if (a1[a_1] < a2[a_2])
            {
                if (i == 0)
                {
                    inter[i] = a1[a_1];
                    i++;
                }
                else
                {
                    if (inter[i - 1] != a1[a_1])
                    {
                        inter[i] = a1[a_1];
                        i++;
                    }
                }
                a_1++;
            }
            else
            {
                if (i == 0)
                {
                    inter[i] = a2[a_2];
                    i++;
                }
                else
                {
                    if (inter[i - 1] != a2[a_2])
                    {
                        inter[i] = a2[a_2];
                        i++;
                    }
                }
                a_2++;
            }
        }
        while (a_1 < a1.length)
        {
            if (inter[i - 1] != a1[a_1])
            {
                inter[i] = a1[a_1];
                i++;
            }
            a_1++;
        }
        while (a_2 < a2.length)
        {
            if (inter[i - 1] != a2[a_2])
            {
                inter[i] = a2[a_2];
                i++;
            }
            a_2++;
        }
        return inter;
    }
    public static void main(String[] args)
    {
        int[] a1 = {10, 5, 7, 5, 9, 4};
        int[] a2 = {7, 5, 15, 7, 7, 9, 10};
        int[] result1 = merge(a1, a2);
        System.out.println(Arrays.toString(result1));
        
        int[] a3 = {0, 2, -4, 6, 10, 8};
        int[] a4 = {12, 0, -4, 8};
        int[] result2 = merge(a3, a4);
        System.out.println(Arrays.toString(result2));
    }
}
