import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter x or X as you operator to end!");
            System.out.println("Enter your operator");

            char operator = input.next().trim().charAt(0);
            if (operator == 'x' || operator == 'X') {
                break;
            }

            int num1 = input.nextInt();
            int num2 = input.nextInt();

            if(operator == '+'){
                System.out.println("Your answer is: "+ (num1+num2));
            } else if (operator == '-') {
                System.out.println("Your answer is: "+ (num1-num2));
            } else if (operator == '*') {
                System.out.println("Your answer is: "+ (num1*num2));
            } else if (operator == '/') {
                System.out.println("Your answer is: "+ (num1/num2));
            } else if (operator == '%') {
                System.out.println("Your answer is: "+ (num1%num2));
            } else {
                System.out.println("Invalid operator!");
            }
        }
        System.out.println("Done!");
    }
}
