public class Search
{
    public static boolean search(Object item, Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return true;
            }
        }
        return false;
    }

    public static boolean search(Object item, Object[] arr, int index)
    {
        if (arr[index].equals(item))
        {
            return true;
        }
        else if (index == arr.length - 1)
        {
            return false;
        }
        return search(item, arr, index + 1);
    }
    public static void main(String[] args)
    {
        Object[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 1; i <= 7; i++) {
            System.out.println(search(i, arr, 0));
        }
        System.out.println(search(-1, arr, 0));
    }
}
