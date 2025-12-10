package OOPs.statics;

public class StaticBlock {
//    initialise static variables using StaticBlock

    static int a = 3;
    static int b;

//    This runs only once, when the class is loaded in JVM
    static {
        System.out.println("In static");
        b = a * 2;
    }

    public static void main(String[] args) {
        StaticBlock sb1 = new StaticBlock();
        System.out.println(StaticBlock.b);

        StaticBlock.b += 5;

        StaticBlock sb2 = new StaticBlock();
        System.out.println(StaticBlock.b);
    }
}
