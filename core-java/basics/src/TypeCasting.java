import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // conversion of smalller type to bigger type happens automatically
        Scanner ip = new Scanner(System.in);
        float num = ip.nextInt(); // works
        //int numb = ip.nextFloat(); //error- bigger to smaller

        // converting bigger type to smaller type explicitly
        int num2 = (int)(67.56f);
        System.out.println(num2);

        // automatic type promotion
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1

        // it follows unicode principles
        int num3 = 'A';
        System.out.println(num3); //ASCI values
    }
}
