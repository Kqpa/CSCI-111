import java.util.Arrays;

public class Problem6 {
    public static int removeDups(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int zeroCount = 0;
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] == arr[i + 1])
            {
                arr[i] = 0;
                zeroCount++;
            }
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != 0)
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
        int[] a1 = { 2, 5, 5, 5, 10, 12, 12 };
        int numUnique = removeDups(a1);
        System.out.println(Arrays.toString(a1));
        System.out.println(numUnique);
    }
}
