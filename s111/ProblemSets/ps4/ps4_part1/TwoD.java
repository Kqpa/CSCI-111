public class TwoD
{
    public static void main(String[] args)
    {
        int[][] twoD = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                       };
        
        System.out.println(twoD[2][0]);
        twoD[2][0] *= 2;
        System.out.println(twoD[2][0]);
        for (int i = 0; i < twoD.length; i++)
        {
            System.out.println(twoD[i][twoD[0].length - 1]);
        }
        for (int i = 0; i < twoD[0].length; i++)
        {
            System.out.println(twoD[0][i]);
        }
    }
}