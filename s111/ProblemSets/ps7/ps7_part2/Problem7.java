import java.util.Arrays;

/*
 * Bora Evinç
 * bevinc26@my.aci.k12.tr
 * This method finds a "mathemathical" intersection of two arrays, ie.
 * not including duplicate values. It inserts 0's to the unused parts of the array. 
 */
public class Problem7
{
    public static int[] intersect(int[] a1, int[] a2)
    {
        if (a1 == null || a2 == null || a1.length == 0 || a2.length == 0)
        {
            throw new IllegalArgumentException();
        }
        int[] inter;
        if (a1.length > a2.length)
        {
            inter = new int[a2.length];
        }
        else
        {
            inter = new int[a1.length];
        }
        Sort.mergeSort(a1);
        Sort.mergeSort(a2);

        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length)
        {
            if (a1[i] <= a2[j])
            {
                if (a1[i] == a2[j])
                {
                    if (k == 0)
                    {
                        inter[k] = a1[i];
                        k++;
                    }
                    else if (inter[k - 1] != a1[i])
                    {
                        inter[k] = a1[i];
                        k++;
                    }
                }
                i++;
            }
            else
            {
                j++;
            }
        }
        return inter;
    }
    public static void main(String[] args)
    {
        int[] a1 = {10, 5, 7, 5, 9, 4};
        int[] a2 = {7, 5, 15, 7, 7, 9, 10};
        int[] result1 = intersect(a1, a2);
        System.out.println(Arrays.toString(result1));

        int[] a3 = {0, 2, -4, 6, 10, 8};
        int[] a4 = {12, 0, -4, 8};
        int[] result2 = intersect(a3, a4);
        System.out.println(Arrays.toString(result2));
    }
}
