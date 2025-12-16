package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();

        // superclass ref type ie Box is assigned to a subclass object ie BoxWeight
        // then part of superclass object are only accessible
        Box b2 = new BoxWeight(2,2);
    }
}
