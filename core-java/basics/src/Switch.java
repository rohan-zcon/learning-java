import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
    //  Get type of fruit
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        // traditional if-else
        if (fruit.equals("Mango")) {
            System.out.println("King");
        } else if (fruit.equals("Apple")) {
            System.out.println("Red fruit");
        } else {
            System.out.println("Invalid fruit");
        }

//        switch
        switch (fruit){
            case "Mango":
                System.out.println("King");
                break;
            case "Apple":
                System.out.println("Red fruit");
                break;
            default:
                System.out.println("Invalid fruit");

        }

        // new syntax switch
        switch (fruit) {
            case "Mango" -> System.out.println("King");
            case "Apple" -> System.out.println("Red fruit");
            default -> System.out.println("Invalid fruit");
        }
    }
}
