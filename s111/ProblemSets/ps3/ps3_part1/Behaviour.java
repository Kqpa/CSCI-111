public class Behaviour 
{
    public static void processString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(str.length() - 1 - i));
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        processString("bora");
    }
}
