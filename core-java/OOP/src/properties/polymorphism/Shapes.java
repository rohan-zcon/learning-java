package properties.polymorphism;

public class Shapes {
    int s = 2;

    void area(){
        System.out.println("Generally area is l * h");
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "s=" + s +
                '}';
    }
}
