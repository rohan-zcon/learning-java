package properties.polymorphism;




public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();

        Shapes square = new Square();
        Square ogSquare = new Square();

        square.area();
        ogSquare.methodSign(); // works
        System.out.println(shapes.toString());
//        square.methodSign(); //not accessible

//        System.out.println(square.length); //not accessible
//        System.out.println(square.s);
    }
}
