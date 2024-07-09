import java.util.Scanner;

public class WhileV2 
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter a number: ");
            num = console.nextInt();
            validInput = num < 50;
        }
    }
}
