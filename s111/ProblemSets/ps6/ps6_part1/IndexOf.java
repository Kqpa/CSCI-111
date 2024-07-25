public class IndexOf
{
    public static int indexOf(int[] arr1, int[] arr2)
    {
        if (arr2.length < arr1.length)
        {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++)
        {
            for (int j = 0; j < arr1.length; j++)
            {
                if (arr2[i + j] == arr1[j])
                {
                    count++;
                }
            }
            if (count == arr1.length)
            {
                return i;
            }
            count = 0;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] list1 = {12, 1, 3, 6};
        int[] list2 = {1, 3, 5, 8, 12, 1, 3, 17, 1, 3, 6, 9, 1, 3, 6};
        System.out.println(indexOf(list1, list2));
    }
}
