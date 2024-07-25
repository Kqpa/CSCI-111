import java.util.Arrays;

public class ShiftRight {
	public static void shiftRight(int[] arr)
	{
		if (arr == null)
		{
			throw new IllegalArgumentException();
		}
		if (arr.length <= 1)
		{
			return;
		}
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i >= 0; i--)
		{
			if (i == 0)
			{
				arr[0] = temp;
			}
			else
			{
				arr[i] = arr[i - 1];
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {};
		shiftRight(arr);
		System.out.println(Arrays.toString(arr));
	}
}
