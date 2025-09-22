import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        sum();
        int s = sum2();
        int s3 = sum3(20, 30);
    }
    /*
    return_type name(params){
     // body
     return statement
     }
     */
    static void sum(){
        Scanner ip = new Scanner(System.in);
        int n1 = ip.nextInt();
        int n2 = ip.nextInt();
        System.out.println("Sum is: " + (n1+n2));
    }

    static int sum2(){
        Scanner ip = new Scanner(System.in);
        int n1 = ip.nextInt();
        int n2 = ip.nextInt();
        return (n1+n2);
    }

    static int sum3(int a, int b){
        return (a+b);
    }
}
