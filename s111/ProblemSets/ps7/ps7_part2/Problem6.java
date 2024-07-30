import java.util.Arrays;

/*
 * Bora Evinç
 * bevinc26@my.aci.k12.tr
 * 
 * This method removes duplicate values in a sorted array
 * and replaces the duplicate values to 0, leaving them to
 * the right side of the array and the rest to the left side.
 */
public class Problem6 {
    public static int removeDups(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int zeroCount = 0;
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] == arr[i + 1])
            {
                arr[i] = Integer.MIN_VALUE;
                zeroCount++;
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != Integer.MIN_VALUE)
            {
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i = arr.length - 1; i > zeroCount; i--)
        {
            arr[i] = 0;
        }
        return arr.length - zeroCount;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 10, 12, 12};
        System.out.println(Arrays.toString(arr));
        int numUnique = removeDups(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(numUnique);
    }
}
