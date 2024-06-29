/*
 * BlockLetterWriter.java
 * Bora Evinç (bevinc26@my.aci.k12.tr)
 * 
 * This program includes the functions to display 
 * characters H, E, Y, O and !. It utilizes these functions
 * to write out HEY HEY! HO YO! in the terminal with blocky fonts.
 */
public class BlockLetterWriter
{
    /*
     * Helper for printing the letters O and H
     */
    public static void _h_oHelper()
    {
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("|     |");
    }

    /*
     * Helper for printing the letter E
     */
    public static void _eHelper()
    {
        System.out.println("|");
        System.out.println("|");
    }

    /*
     * Helper for printing the character !
     */
    public static void _exclamationHelper()
    {
        System.out.println("   |");
        System.out.println("   |");
    }

    /*
     * Helper for printing the spaces in between letters
     */
    public static void _spaceHelper()
    {
        System.out.println();
        System.out.println();
    }

    /*
     * Prints the letter H
    */
    public static void writeH()
    {
        _h_oHelper();
        System.out.println("+-----+");
        _h_oHelper();
    }

    /*
     * Prints the letter E
    */
    public static void writeE()
    {
        System.out.println("+------");
        _eHelper();
        System.out.println("+----");
        _eHelper();
        System.out.println("+------");
    }

    /*
     * Prints the letter Y
    */
    public static void writeY()
    {
        System.out.println("\\     /");
        System.out.println(" \\   /");
        System.out.println("  \\ /");
        System.out.println("   V");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
    }

    /*
     * Prints the letter O
    */
    public static void writeO()
    {
        System.out.println("+-----+");
        _h_oHelper();
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("+-----+");
    }

    /*
     * Prints the character !
    */
    public static void writeExclamationMark()
    {
        _exclamationHelper();
        _exclamationHelper();
        System.out.println("   |");
        System.out.println("   '");
        System.out.println("   *");
    }
 
    /*
    * Prints out HEY
    */
    public static void writeHEY()
    {
        writeH();
        System.out.println();
        writeE();
        System.out.println();
        writeY();
    }

    /*
     * Prints out HO
     */
    public static void writeHO()
    {
        writeH();
        System.out.println();
        writeO();
    }
    
    /*
     * Prints out YO
     */
    public static void writeYO()
    {
        writeY();
        System.out.println();
        writeO();
    }

    /*
     * Leaves 5 lines of space
     */
    public static void leaveSpace()
    {
        _spaceHelper();
        _spaceHelper();
        System.out.println();
    }

    /*
     * Writing out HEY HEY! HO YO!
     */
    public static void main(String[] args)
    {
        writeHEY();
        leaveSpace();

        writeHEY();
        System.out.println();
        writeExclamationMark();
        leaveSpace();
        
        writeHO();
        leaveSpace();
        
        writeYO();
        System.out.println();
        writeExclamationMark();
        System.out.println();
    }
}