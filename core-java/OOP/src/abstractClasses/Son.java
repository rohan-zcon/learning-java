package abstractClasses;

public class Son extends Parent{
    String name;
    int age;

    public Son(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void name() {
        System.out.println("I am Son, my name is "+ this.name);
    }

    @Override
    void age() {
        System.out.println("I am son, my age is " + this.age);
    }
}
