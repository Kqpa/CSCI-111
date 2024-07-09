import java.util.Scanner;

public class WhileLoop 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        int num;
        do 
        {
            System.out.print("Enter a number: ");
            num = console.nextInt();
        }
        while (Math.sqrt(num) % 1 != 0);
    }
}
