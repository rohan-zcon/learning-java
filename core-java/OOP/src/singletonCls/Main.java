package singletonCls;

public class Main {
    public static void main(String[] args) {
        // pass the same object to different reference var
        // all 3 ref var pointing to just one object of Singleton class
        Singleton o1 = Singleton.getInstance();
        Singleton o2 = Singleton.getInstance();
        Singleton o3 = Singleton.getInstance();
    }
}