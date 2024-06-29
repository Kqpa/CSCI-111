public class Flow {
    public static void go() {
        System.out.println("hello");
    }

    public static void with() {
        go();
        System.out.println("bye");
    }

    public static void the() {
        System.out.println("see ya");
        with();
    }

    public static void flow() {
        with();
        go();
    }

    public static void main(String[] args) {
        go();
        flow();
        the();
    }
}