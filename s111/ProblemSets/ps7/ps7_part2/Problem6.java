import java.util.Arrays;

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
            arr[i] = 0;
        }
       return arr.length - zeroCount;
    }
    public static int[] createSortedArray(int size, int min, int max)
    {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        boolean isSorted = false;
        while (!isSorted)
        {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }
    public static void print(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        //int[] arr = createSortedArray(20, -5, 5);
        int[] arr = {0, 0, 2, 2, 5, 5, 12, 13, 13, 13};
        print(arr);
        int numUnique = removeDups(arr);
        print(arr);
        System.out.println(numUnique);
    }
}
