public class ScopePuzzle {
    public static void doSomething() {
        int a = 1;
        System.out.println(________);            // first println (a)
        int b = 5;

        for (int i = 1; i <= 5; i++) {
            int c = 2;
            for (int j = 0; j < 3; j++) {
                int d = 4;
                System.out.println(________);    // second println (a,b,i,c,j,d)
            }
            System.out.println(________);        // third println (a,b,i,c)
        }

        System.out.println(________);            // fourth println (a,b)
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(________);            // fifth println (x)

        int y = 2;
        doSomething();
        System.out.println(________);            // sixth println (x,y)
    }
}