public class Foo
{
	private int a;
	private double b;

	public Foo(int a, double b)
	{
		setA(a);
		setB(b);
	}

	public void setA(int a)
	{
		if (a % 2 != 0)
		{
			throw new IllegalArgumentException("`a` has to be even");
		}
		this.a = a;
	}

	public void setB(double b)
	{
		if (b < 0)
		{
			throw new IllegalArgumentException("`b` has to be a non-negative real number");
		}
		this.b = b;
	}

	public double bar()
	{
		return this.a * this.b;
	}
}