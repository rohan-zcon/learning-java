import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // IP/OP from terminal
        // System.out.printf("Enter a integer: ");
        Scanner input = new Scanner(System.in);
        // System.out.println(input.nextInt());

        // Primitive datatypes
        int rollno = 65;
        char letter = 'r';
        float marks = 98.4f;
        double largeDecimalNum = 5445454.454545; // default
        long largeInt = 54545454545454L;
        boolean check = false;

        System.out.printf("Enter a integer: ");
        int ipRollNo = input.nextInt();
        System.out.println("Entered roll no is " + ipRollNo);
    }
}