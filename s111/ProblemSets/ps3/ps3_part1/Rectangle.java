public class Rectangle
{
    public static double perimeter(double l, double w)
    {
        double perim = 2*(l + w);
        return perim;
    }
    public static void main(String[] args)
    {
        System.out.println(perimeter(10.5, 2.2));
    }
}