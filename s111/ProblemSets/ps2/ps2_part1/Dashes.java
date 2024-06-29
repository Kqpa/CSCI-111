public class Dashes
{
	public static void main(String[] args)
	{
		for (int line = 1; line <= 4; line++)
		{
			for (int i = 0; i < line + 1; i++)
			{
				System.out.print("-");
			}
			for (int i = 0; i < -2*line + 8; i++)
			{
				System.out.print("!");
			}
			for (int i = 0; i < line + 1; i++)
			{
				System.out.print("-");
			}
			System.out.println();
		}
	}
}