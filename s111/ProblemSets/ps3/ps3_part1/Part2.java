public class Part2
{
    public static void main(String[] args)
    {
        String str1 = "Go";
        String str2 = "Crimson!";
        System.out.println(str1 + " " + str2);
        System.out.println(str1.toUpperCase() + str2.charAt(7));
        System.out.println(str2.charAt(0) + "" + str2.charAt(3) + str2.substring(5));
        System.out.println(str2.indexOf('s'));
        System.out.println(str2.toLowerCase().charAt(0));
        System.out.println((str1 + str2).replace('o', 'u'));
        /*
        System.out.println(str1.indexOf('o'));
        System.out.println(str2.substring(1, 4));
        System.out.println(str2.toUpperCase().substring(3));
        System.out.println(str2.substring(3).toUpperCase());
        System.out.println(str1.toLowerCase().charAt(0) + str2.substring(1));
        System.out.println((str1 + str2).toUpperCase());
        */
    }
}
