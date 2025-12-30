package abstractClasses;

public class Daughter extends Parent{
    String name;
    int age;

    public Daughter(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    void name() {
        System.out.println("I am daughter, my name is " + this.name);
    }

    @Override
    void age() {
        System.out.println("I am daughter, my age is "+ this.age);
    }
}
