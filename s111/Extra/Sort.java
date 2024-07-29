import java.util.Arrays;
public class Sort
{
    public static void SelectionSort(int[] arr)
    {
        System.out.println("Selection Sort: ");
        print(arr);
        for (int i = 0; i < arr.length; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[minIndex] > arr[j])
                {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        print(arr);
    }
    public static void InsertionSort(int[] arr)
    {
        System.out.println("Insertion Sort: ");
        print(arr);
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < arr[i-1])
            {
                int j = i;
                int toInsert = arr[i];
                do
                {
                    arr[j] = arr[j - 1];
                    j--;
                }
                while (j > 0 && toInsert < arr[j - 1]);
                arr[j] = toInsert;
            }
        }
        print(arr);
    }
    public static void BubbleSort(int[] arr)
    {
        System.out.println("Bubble Sort: ");
        print(arr);
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
        print(arr);
    }
    public static int[] createArray(int size, int min, int max)
    {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return arr;
    }  
    public static void print(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        int[] arr; 
        arr = createArray(10, 1, 20);
        SelectionSort(arr);
        arr = createArray(10, 1, 20);
        BubbleSort(arr);
        arr = createArray(10, 1, 20);
        InsertionSort(arr);
    }
}