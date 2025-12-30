package interfaces;

public class Main {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.changeGear(2);
        b1.speedUp(23);
        b1.applyBreak(1);

        Car c1 = new Car();
        c1.changeGear(3);
        c1.speedUp(45);
        c1.applyBreak(2);
    }
}
