package OOPs.statics;

public class Main {
    public static void main(String[] args) {
        StaticHuman h1 = new StaticHuman(25, "rohan", 2500, false);
        StaticHuman h2 = new StaticHuman(26, "sohan", 3500, true);

        System.out.println(StaticHuman.population);
        fun();

        Main funn = new Main();
        funn.fun2();
    }

    static void fun()  {
        // This will not work. non-static means it needs an obj to run but fun() is static which is independent of object
//        greetings();

        System.out.println("this is fun");
    }

    void fun2(){
//        Works, because fun2 and greetings both are non-static
        greetings();
        System.out.println("this is fun2");
    }

    void greetings(){
        System.out.println("this is greetings");
    }
}
