import java.util.Arrays;

public class SwapSort
{
    /*
     * This method uses nested for loops to traverse through 
     * the array to compare every index to the rest of the array,
     * and swaps it so that it can have a decreasing order.
     */
    public static void swapSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    swap(arr, i, j);
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 4, 32, 7, 3, 1, 7, 8, 9, 6, 2};
        System.out.println(Arrays.toString(arr));
        swapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
