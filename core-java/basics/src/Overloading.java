public class Overloading {
    public static void main(String[] args) {
        fun(2);
        fun("test");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String s){
        System.out.println(s);
    }
}
