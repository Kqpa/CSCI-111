public class Client
{
    public static void main(String[] args)
    {
        String[] letters3 = {"a", "b", "c", "d", "e", "f"};
        ArrayList list3 = new ArrayList(letters3);
        System.out.println(list3);
        list3.rotate(4);
        System.out.println(list3);
        
        System.out.println();

        String[] letters4 = {"a", "b", "c", "d", "e", "f"};
        LLList list4 = new LLList(letters4);
        System.out.println(list4);
        list4.rotate(4);
        System.out.println(list4);
    }    
}
