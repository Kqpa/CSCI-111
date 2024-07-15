public class Recursion
{
    public static boolean isPrefix(String sub, String s)
    {
        System.out.println("starting call for " + sub + "," + s);
        if (sub.equals("") || s.equals(sub))
        {
            return true;
        }
        else if (sub.length() > s.length())
        {
            return false;
        }
        else if (sub.charAt(0) != s.charAt(0))
        {
            return false;
        }
        else
        {
            boolean a = isPrefix(sub.substring(1), s.substring(1));
            System.out.println("call for " + sub + "," + s + "---> " + a);
            return a;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(isPrefix("pre", "prefix"));
    }
}
