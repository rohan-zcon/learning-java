package generics;

public class Main {
    public static void main(String[] args) {
        CustomArrayList al1 = new CustomArrayList();

        al1.add(2);
        al1.add(4);
        al1.add(5);
        al1.add(7);
        al1.add(3);
        al1.add(9);
        al1.add(12);

        System.out.println(al1.toString());
    }
}
