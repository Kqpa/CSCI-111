public class shape
{
	public static void main(String[] args)
	{
		for (int l = 1; l <= 4; l++)
		{
			for (int s = 0; s < l + 2; s++)
			{
				System.out.print("\\");
			}
			for (int c = 0; c < -3*l + 12; c++)
			{
				System.out.print(":");
			}
			System.out.println();
		}
	}
}

