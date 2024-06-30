/*
 * Bora Evinç
 * bevinc26@my.aci.k12.tr
 * 
 * Program for printing the Zakim Bridge using 
 * for loops
 */

public class BridgeDrawing 
{  
    /*
     *  /|\
     * //|\\
     */
    public static void printTop()
    {
       for (int l = 1; l <= 2; l++)
       {
            for (int i = 0; i < -1*l + 16; i++)
            {
                System.out.print(" ");
            }            
            for (int i = 0; i < l; i++)
            {
                System.out.print("/");
            }
            System.out.print("|");
            for (int i = 0; i < l; i++)
            {
                System.out.print("\\");
            }
            System.out.println();
       }
    }

    /*
     * Helper function for printing repeated part on the neck
     * |:|:|
     * |:|:|
     */
    public static void _neckHelper_1()
    {
        for (int l = 1; l <= 2; l++)
        {
            for (int i = 0; i < 14; i++)
            {
                System.out.print(" ");
            }
            for (int i = 0; i < 2; i++)
            {
                System.out.print("|:");
            }
            System.out.println("|");
        }
    }

    /*
     * Helper function for printing repeated part on the neck
     * -----
     */
    public static void _neckHelper_2()
    {
        for (int i = 0; i < 14; i++)
        {
            System.out.print(" ");
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }


    /*
     * |:|:|
     * |:|:|
     * -----
     * |:|:|
     * |:|:|
     * -----
     * |:|:|
     * |:|:|
     */
    public static void printNeck()
    {
        for (int i = 0; i < 3; i++)
        {
            if (i != 2)
            {
                _neckHelper_1();
                _neckHelper_2();
            }
            else
            {
                _neckHelper_1();
            }
        }
    }

    /*
     * Helper function for repeated printing on body
     * /{{{/
     */
    public static void _bodyHelper_1()
    {
        System.out.print("/");
        for (int i = 0; i < 3; i++)
        {
            System.out.print("{");
        }
        System.out.print("/");
    }

    /*
     * Helper function for repeated printing on body
     * \}}}\
     */
    public static void _bodyHelper_2()
    {
        System.out.print("\\");
        for (int i = 0; i < 3; i++)
        {
            System.out.print("}");
        }
        System.out.print("\\");
    }

    /*
     * /-----\
     */
    public static void printBody_1()
    {
        for (int i = 0; i < 13; i++)
        {
            System.out.print(" ");
        }
        System.out.print("/");
        for (int i = 0; i < 5; i++)
        {
            System.out.print("-");
        }
        System.out.println("\\");
    }
    
    /*
     *   /{{{|}}}\
     *  /{{{{|}}}}\
     * /{{{{{|}}}}}\
     */
    public static void printBody_2()
    {
        for (int l = 1; l <= 3; l++)
        {
            for (int i = 0; i < -1*l + 13; i++)
            {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 0; i < l + 2; i++)
            {
                System.out.print("{");
            }
            System.out.print("|");
            for (int i = 0; i < l + 2; i++)
            {
                System.out.print("}");
            }
            System.out.println("\\");
        }
    }

    /*
     *   /{{{/     \}}}\
     *  /{{{/       \}}}\
     */
    public static void printBody_3()
    {
        for (int l = 1; l <= 2; l++)
        {
            for (int i = 0; i < -1*l + 10; i++)
            {
                System.out.print(" ");
            }
            _bodyHelper_1();
            for (int i = 0; i < 2*l + 3; i++)
            {
                System.out.print(" ");
            }
            _bodyHelper_2();
            System.out.println();
        }
    }

    /*
     *    /{{{/\       /\}}}\
     *   /{{{/  \     /  \}}}\
     *  /{{{/    \   /    \}}}\
     * /{{{/      \ /      \}}}\
     */
    public static void printBody_4()
    {
        for (int l = 1; l <= 4; l++)
        {
            for (int i = 0; i < -1*l + 8; i++)
            {
                System.out.print(" ");
            }
            _bodyHelper_1();
            for (int i = 0; i < 2*l -2; i++)
            {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int i = 0; i < -2*l + 9; i++)
            {
                System.out.print(" ");

            }
            System.out.print("/");
            for (int i = 0; i < 2*l -2; i++)
            {
                System.out.print(" ");
            }
            _bodyHelper_2();
            System.out.println();
        }
   }

   /*
    *    /{{{/        |        \}}}\
    *   /{{{/         |         \}}}\
    *  /{{{/          |          \}}}\
    * /{{{/           |           \}}}\
    */
   public static void printBody_5()
   {
        for (int l = 1; l <= 4; l++)
        {
            for (int i = 0; i < -1*l + 4; i++)
            {
                System.out.print(" ");
            }
            _bodyHelper_1();
            for (int i = 0; i < l + 7; i++)
            {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int i = 0; i < l + 7; i++)
            {
                System.out.print(" ");
            }
            _bodyHelper_2();
            System.out.println();
        }
   }

   /*
    * ====            =            ====
    */
   public static void printFoot()
   {
        for (int i = 0; i < 4; i++)
        {
            System.out.print("=");
        }
        for (int i = 0; i < 12; i++)
        {
            System.out.print(" ");
        }
        System.out.print("=");
        for (int i = 0; i < 12; i++)
        {
            System.out.print(" ");
        }
        for (int i = 0; i < 4; i++)
        {
            System.out.print("=");
        }
        System.out.println(); 
   }

    public static void main(String[] args)
    {
        printTop();
        printNeck();
        printBody_1();
        printBody_2();
        printBody_3();
        printBody_4();
        printBody_5();
        printFoot();
    }
}
