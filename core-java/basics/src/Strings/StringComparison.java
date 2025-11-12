package Strings;

public class StringComparison {

    public static void main(String[] args) {
//        Strings are immutable in nature. once initialised, it cannot be modified
//        "==" checks for reference & values both
//        "=" checks only for value
//        .equals() methods only checks for value

//        this is created in string pool in heap mem
        String a = "rohan";
        String b = "rohan";
        System.out.println(a == b);
        int z = 2;
        Integer s = 3;

//        this is created in heap mem but outside of string pool
//        so they not pointing to the same object
        String n1 = new String("sawant");
        String n2 = new String("sawant");
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
    }
}
