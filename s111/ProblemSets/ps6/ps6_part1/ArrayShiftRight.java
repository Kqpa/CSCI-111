public class ArrayShiftRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        shiftRight(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void shiftRight(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int last = arr[arr.length - 1];

        // Shift elements to the right
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = last;
            last = temp;
        }
    }
}