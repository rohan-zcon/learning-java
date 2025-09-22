import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        x(1,2,3,4,22,23,4,5,5); //variable length args stores internally as array
    }

    static void x(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
