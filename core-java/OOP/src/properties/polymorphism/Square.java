package properties.polymorphism;

public class Square extends Shapes{
    int length;

    @Override
    void area() {
        System.out.println("Square area is l * h");
    }

    void methodSign(){
        System.out.println("I am in Square");
    }
}
