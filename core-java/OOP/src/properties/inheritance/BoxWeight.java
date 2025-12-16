package properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(double weight) {
        this.weight = weight;
    }

    // super is used to call parent class constructor
    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
