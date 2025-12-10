package OOPs.statics;

public class StaticHuman {
    int age;
    String name;
    int salary;
    boolean married;
    // static means its common across the class, independent of the object.
    // it can be accessed even before any object of the class is created
    static long population;

    public StaticHuman(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        StaticHuman.population += 1;
    }
}
