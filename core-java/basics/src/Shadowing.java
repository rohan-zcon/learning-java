public class Shadowing {
    static int x = 10; // class variable gets shadowed by lower level initialisation

    public static void main(String[] args) {
        System.out.println(x); // 10
        int x = 20;
        System.out.println(x); // 20
        fun();
    }

    static void fun() {
        System.out.println(x); // 10
    }
}
