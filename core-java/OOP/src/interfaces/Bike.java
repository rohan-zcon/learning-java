package interfaces;

public class Bike implements Vehicle{
    @Override
    public void changeGear(int gear) {
        System.out.println("Changing BIKE gear, "+ gear);
    }

    @Override
    public void speedUp(int speed) {
        System.out.println("Changing BIKE speed, "+ speed);
    }

    @Override
    public void applyBreak(int breaks) {
        System.out.println("Applying BIKE break, "+ breaks);
    }
}
